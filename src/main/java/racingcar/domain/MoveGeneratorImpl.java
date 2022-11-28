package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class MoveGeneratorImpl implements MoveGenerator {
    private final Integer MIN_NUMBER = 0;
    private final Integer MAX_NUMBER = 9;

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}
