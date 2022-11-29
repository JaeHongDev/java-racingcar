package racingcar.view;

import camp.nextstep.edu.missionutils.test.NsTest;
import java.util.ArrayList;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class InputViewTest extends NsTest {

    @Test
    void 재귀테스트() {
        var stringList = new ArrayList<String>();

        for (int i = 0; i < 100000; i++) {
            stringList.add("2");
        }
        run(stringList.toArray(String[]::new));

        Assertions.assertThatIllegalStateException().isThrownBy(() -> new InputView().recursiveMethod());
    }


    @Override
    protected void runMain() {

    }
}