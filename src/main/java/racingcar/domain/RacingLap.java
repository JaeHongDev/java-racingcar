package racingcar.domain;

public class RacingLap {
    public static final String ERROR_INPUT_IS_NUMBER = "반복횟수는 숫자여야만 합니다.";
    private static final Long ZERO = 0L;
    private static final Long COUNT_NUMBER = 1L;

    private final Long lap;

    public RacingLap(final String input) {
        validateInputIsNumber(input);
        this.lap = Long.valueOf(input);
    }

    private RacingLap(Long lap) {
        this.lap = lap;
    }

    public static RacingLap generateReadyLapState() {
        return new RacingLap(ZERO);
    }

    private void validateInputIsNumber(String input) {
        try {
            Long.valueOf(input);
        } catch (Exception exception) {
            throw new IllegalArgumentException(ERROR_INPUT_IS_NUMBER);
        }
    }

    public boolean isLessThan(RacingLap racingLap) {
        return this.lap < racingLap.lap;
    }

    public RacingLap nextLap() {
        return new RacingLap(lap + COUNT_NUMBER);
    }
}
