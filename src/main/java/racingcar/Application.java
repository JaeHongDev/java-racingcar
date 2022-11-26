package racingcar;

import racingcar.game.RacingLauncher;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행

        RacingLauncher racingLauncher = new RacingLauncher(new InputView());
        racingLauncher.execute();
    }
}
