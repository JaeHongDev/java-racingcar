package racingcar.view;

public class Printer {
    private static final String ERROR = "[ERROR] ";

    protected void println() {
        System.out.println();
    }

    protected void println(final Object message) {
        System.out.println(message);
    }

    protected void print(final Object message) {
        System.out.print(message);
    }

    protected void printlnError(Exception exception) {
        this.println(ERROR + exception.getMessage());
    }
}
