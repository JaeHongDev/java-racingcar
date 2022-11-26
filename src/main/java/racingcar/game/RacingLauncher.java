package racingcar.game;

import racingcar.view.InputView;

public class RacingLauncher {
    private final InputView inputView;
    
    public RacingLauncher(final InputView inputView) {
        this.inputView = inputView;
    }

    public void execute() {
        var participants = inputView.readParticipant();
        var racingRound = inputView.readRacingRound();

        var game = new RacingGame(participants, racingRound);

        while (game.runnable()) {
            game.move();
        }
    }
}
