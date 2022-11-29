package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.NoSuchElementException;
import racingcar.domain.Participants;
import racingcar.domain.RacingLap;

public class InputView extends Printer {

    public Participants readParticipants() {
        while (true) {
            try {
                this.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
                return new Participants(Console.readLine());
            } catch (NoSuchElementException exception) {
                throw new IllegalStateException();
            } catch (Exception exception) {
                this.printlnError(exception);
            }
        }
    }

    public RacingLap readRacingLap() {
        while (true) {
            try {
                this.println("시도할 회수는 몇회인가요?");
                return new RacingLap(Console.readLine());
            } catch (NoSuchElementException exception) {
                throw new IllegalStateException();
            } catch (Exception exception) {
                this.printlnError(exception);
            }
        }
    }

    // 여기서 1이아닌 값이 들어오면 재귀로 다시 호출하도록 해볼께요
    public String recursiveMethod() {
        try {
            var a = Console.readLine();
            if (a.equals("1")) {
                return a;
            }
            throw new Exception();
        } catch (Exception exception) {
            return recursiveMethod();
        } catch (StackOverflowError exception) {
            throw new IllegalStateException();
        }
    }

}
