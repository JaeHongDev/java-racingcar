package racingcar.game;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Participants;
import racingcar.domain.RacingRound;

public class RacingGame {
    private final Participants participants;
    private final RacingRound racingRound;
    private final RacingRound nowRound;

    public RacingGame(Participants participants, RacingRound racingRound) {
        this.participants = participants;
        this.racingRound = racingRound;
        this.nowRound = new RacingRound("0");
    }

    public String move() {
        var listNumber = Randoms.pickUniqueNumbersInRange(1, 9, racingRound.getRound());
        return participants.move(listNumber);
    }


    public boolean runnable() {
        return racingRound.equals(nowRound);
    }
}
