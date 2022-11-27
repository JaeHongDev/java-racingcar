package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Participants;
import racingcar.domain.RacingLap;

public class InputView {

    public Participants readParticipants() {
        System.out.println("자동차 경주에 참여할 자동차를 입력해주세요.");
        return new Participants(Console.readLine());
    }

    public RacingLap readRacingLap() {
        System.out.println("반복횟수를 입력해주세요.");
        return new RacingLap(Console.readLine());
    }
}
