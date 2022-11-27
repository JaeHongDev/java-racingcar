package racingcar.domain;

public class RacingLap {
    private final Integer lap;

    public RacingLap(final String input) {
        this.lap = Integer.parseInt(input);
    }

    private RacingLap(Integer lap) {
        this.lap = lap;
    }

    public static RacingLap generateReadyLapState() {
        return new RacingLap(0);
    }

    public boolean isLessThan(RacingLap racingLap) {
        return this.lap < racingLap.lap;
    }

    public RacingLap nextLap() {
        return new RacingLap(lap + 1);
    }
}
