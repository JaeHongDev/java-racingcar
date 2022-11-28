package racingcar.view;

public class OutputView extends Printer {

    public void printLap(String lapResult) {
        this.println(lapResult);
        this.println();
    }

    public void printWinner(String playWinner) {
        this.println("최종 우승자 : " + playWinner);
    }


    public void printResult() {
        this.println("최종 결과");
    }
}
