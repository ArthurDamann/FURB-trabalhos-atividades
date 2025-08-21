package model;

public class AnalysisError extends Exception {

    private int position;

    public AnalysisError(String msg, int position) {
        super(msg);
        this.position = position;
    }

    public AnalysisError(String msg) {
        super(msg);
        this.position = -1;
    }

    public int getPosition() {
        return position;
    }

    public String toString() {
        return super.toString() + ", @ " + position;
    }

    public AnalysisError(String msg, int position, char character) {
        super(character + " " + msg);
        this.position = position;
    }

    public AnalysisError(String msgEncontrado, int position, String character, String msgEsperado) {
        super(msgEncontrado + " " + character + " " + msgEsperado);
        this.position = position;
    }

    public String getError() {
        return null;
    }

    public final int getRow(String text) {

        String[] arrayLines = text.split("\n");
        int line = 0;
        int countLine = 0;

        for (int i = 0; i < arrayLines.length; i++) {

            arrayLines[i] += "\n";
            countLine += arrayLines[i].length();

            if (countLine > position) {
                line += i + 1;

                break;
            }
        }

        return line == 0 ? line + 1 : line;
    }
}
