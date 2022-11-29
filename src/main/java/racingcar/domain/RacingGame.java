package racingcar.domain;

public class RacingGame {
    private final Participants participants;
    private final RacingLap racingLap;
    private final MoveMaker moveMaker;
    private RacingLap nowRacingLap;

    public RacingGame(Participants participants, RacingLap racingLap, MoveMaker moveMaker) {
        this.participants = participants;
        this.racingLap = racingLap;
        this.nowRacingLap = RacingLap.generateReadyLapState();
        this.moveMaker = moveMaker;
    }

    public String goLap() {
        this.nowRacingLap = nowRacingLap.nextLap();
        return this.participants.moveAll(moveMaker);
    }

    public boolean runnable() {
        return this.nowRacingLap.isLessThan(racingLap);
    }

    public String getPlayWinner() {
        return this.participants.getWinner();
    }
}
