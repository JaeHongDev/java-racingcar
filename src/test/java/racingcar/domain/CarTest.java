package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CarTest {


    @ParameterizedTest
    @ValueSource(strings = {"123456", "1234567"})
    void 자동차의_이름이_5글자를_넘을_수_없습니다(final String input) {
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car(input))
                .withMessageContaining(Car.ERROR_CAR_NAME);

    }

    @Test
    void 자동차가_5번_전진하고_난_이후_자신의_결괄를_출력합니다() {
        var car = new Car("name");
        var actual = car.move(5);
        Assertions.assertThat(actual).isEqualTo("name:-");
    }

}