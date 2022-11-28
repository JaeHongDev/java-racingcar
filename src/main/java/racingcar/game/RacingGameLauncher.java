package racingcar.game;

import racingcar.domain.MoveGeneratorImpl;
import racingcar.domain.MoveMaker;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameLauncher {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingGameLauncher() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void execute() {
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
