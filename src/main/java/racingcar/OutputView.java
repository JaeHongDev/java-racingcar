package racingcar;

public class OutputView {
    public void printLap(String lapResult) {
        System.out.println(lapResult);
        System.out.println();
    }

    public void printWinner(String playWinner) {
        System.out.println("최종 우승자 : " + playWinner);
    }

    public void printError(String message) {
        System.out.println("[ERROR] " + message);
    }
}
