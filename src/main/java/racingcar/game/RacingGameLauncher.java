package racingcar.game;

import racingcar.domain.MoveGeneratorImpl;
import racingcar.domain.MoveMaker;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameLauncher {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingGameLauncher(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void execute() {
        try {
            process();
        } catch (IllegalStateException exception) {
            // not doing
        }
    }

    private void process() {
        var participants = inputView.readParticipants();
        var racingLap = inputView.readRacingLap();
        var racingGame = new RacingGame(participants, racingLap, new MoveMaker(new MoveGeneratorImpl()));

        outputView.printResult();

        while (racingGame.runnable()) {
            outputView.printLap(racingGame.goLap());
        }

        outputView.printWinner(racingGame.getPlayWinner());
    }

}
