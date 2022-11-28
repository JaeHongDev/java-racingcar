package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Participants;
import racingcar.domain.RacingLap;

public class InputView extends Printer {

    public Participants readParticipants() {
        try {
            this.println("자동차 경주에 참여할 자동차를 입력해주세요.");
            return new Participants(Console.readLine());
        } catch (Exception exception) {
            this.printlnError(exception);
            return readParticipants();
        }
    }

    public RacingLap readRacingLap() {
        try {
            this.println("반복횟수를 입력해주세요.");
            return new RacingLap(Console.readLine());
        } catch (Exception exception) {
            this.printlnError(exception);
            return readRacingLap();
        }
    }


}