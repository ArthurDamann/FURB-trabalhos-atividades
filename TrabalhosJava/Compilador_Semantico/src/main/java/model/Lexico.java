package model;

public class Lexico implements Constants {
    private int position;
    private String input;
    private String lexeme;

    public Lexico() {
        this("");
    }

    public Lexico(String input) {
        setInput(input);
    }

    public void setInput(String input) {
        this.input = input;
        setPosition(0);
    }

    public void setPosition(int pos) {
        position = pos;
    }

    public Token nextToken() throws LexicalError {
        lexeme = "";
        if (!hasInput())
            return null;

        int start = position;

        int state = 0;
        int lastState = 0;
        int endState = -1;
        int end = -1;

        while (hasInput()) {
            lastState = state;
            char currentChar = nextChar();
            state = nextState(currentChar, state);

            if (state < 0)
                break;

            else {
                lexeme += currentChar;
                if (tokenForState(state) >= 0) {
                    endState = state;
                    end = position;
                }
            }
        }

        if (endState < 0 || (endState != state && tokenForState(lastState) == -2)) {
            String invalidLexeme = lexeme.isEmpty() ? String.valueOf(input.charAt(position - 1)) : lexeme;
            throw new LexicalError(SCANNER_ERROR[lastState], start, invalidLexeme.charAt(0), invalidLexeme);
        }

        position = end;

        int token = tokenForState(endState);

        if (token == 0)
            return nextToken();
        else {
            String lexeme = input.substring(start, end);
            token = lookupToken(token, lexeme);
            return new Token(token, lexeme, start);
        }
    }

    public String getCurrentLexeme() {
        return lexeme;
    }

    private int nextState(char c, int state) {
        int start = SCANNER_TABLE_INDEXES[state];
        int end = SCANNER_TABLE_INDEXES[state + 1] - 1;

        while (start <= end) {
            int half = (start + end) / 2;

            if (SCANNER_TABLE[half][0] == c)
                return SCANNER_TABLE[half][1];
            else if (SCANNER_TABLE[half][0] < c)
                start = half + 1;
            else
                end = half - 1;
        }

        return -1;
    }

    private int tokenForState(int state) {
        if (state < 0 || state >= TOKEN_STATE.length)
            return -1;

        return TOKEN_STATE[state];
    }

    public int lookupToken(int base, String key) {
        int start = SPECIAL_CASES_INDEXES[base];
        int end = SPECIAL_CASES_INDEXES[base + 1] - 1;

        while (start <= end) {
            int half = (start + end) / 2;
            int comp = SPECIAL_CASES_KEYS[half].compareTo(key);

            if (comp == 0)
                return SPECIAL_CASES_VALUES[half];
            else if (comp < 0)
                start = half + 1;
            else
                end = half - 1;
        }

        return base;
    }

    private boolean hasInput() {
        return position < input.length();
    }

    private char nextChar() {
        if (hasInput())
            return input.charAt(position++);
        else
            return (char) -1;
    }
}
