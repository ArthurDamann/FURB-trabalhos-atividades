package model;

public class LexicalError extends AnalysisError {

    private String lexeme;

    public LexicalError(String msg, int position, char character, String lexeme) {
        super(msg, position, character);
        this.lexeme = lexeme;
    }

    public LexicalError(String msg, int position, char character) {
        super(msg, position, character);
    }

    public LexicalError(String msg, int position) {
        super(msg, position);
    }

    public LexicalError(String msg) {
        super(msg);
    }

  
    public String getLexeme() {
        return lexeme;
    }
}