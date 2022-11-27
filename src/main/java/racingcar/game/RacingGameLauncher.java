package racingcar.game;

import racingcar.InputView;
import racingcar.OutputView;
import racingcar.domain.MoveGeneratorImpl;
import racingcar.domain.MoveMaker;
import racingcar.domain.RacingGame;

public class RacingGameLauncher {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingGameLauncher() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void execute() {
        try {
            var participants = inputView.readParticipants();
            var racingLap = inputView.readRacingLap();
            var racingGame = new RacingGame(participants, racingLap, new MoveMaker(new MoveGeneratorImpl()));

            while (racingGame.runnable()) {
                outputView.printLap(racingGame.goLap());
            }

            outputView.printWinner(racingGame.getPlayWinner());
        } catch (Exception exception) {
            outputView.printError(exception.getMessage());
        }
    }

}
