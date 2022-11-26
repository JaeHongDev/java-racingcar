package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Participants;
import racingcar.domain.RacingRound;

public class InputView extends ViewPrinter {

    public Participants readParticipant() {
        this.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return new Participants(Console.readLine());
    }

    public RacingRound readRacingRound() {
        this.println("시도할 회수는 몇회인가요?");
        return new RacingRound(Console.readLine());
    }
}
