package racingcar;

import racingcar.game.RacingGameLauncher;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행

        var racingGameLauncher = new RacingGameLauncher(new InputView(), new OutputView());
        racingGameLauncher.execute();
    }
}
