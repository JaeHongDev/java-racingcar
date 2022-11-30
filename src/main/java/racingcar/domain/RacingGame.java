package racingcar.domain;

public class RacingGame {
    private final Participants participants;
    private final RacingLap lastRacingLap;
    private final MoveMaker moveMaker;
    private RacingLap nowRacingLap;

    public RacingGame(Participants participants, RacingLap lastRacingLap, MoveMaker moveMaker) {
        this.participants = participants;
        this.lastRacingLap = lastRacingLap;
        this.moveMaker = moveMaker;
        this.nowRacingLap = RacingLap.generateReadyLapState();
    }

    public String goLap() {
        this.nowRacingLap = nowRacingLap.nextLap();
        return this.participants.moveAll(moveMaker);
    }

    public boolean runnable() {
        return this.nowRacingLap.isLessThan(lastRacingLap);
    }

    public String getPlayWinner() {
        return this.participants.getWinner();
    }
}
