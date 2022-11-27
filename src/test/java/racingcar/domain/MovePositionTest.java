package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MovePositionTest {

    @ParameterizedTest
    @ValueSource(ints = {5, 6, 7, 8, 9})
    void _4이상일경우_한칸_전진합니다(final Integer input) {
        var movePosition = MovePosition.generateZeroPosition();

        var actual = movePosition.move(input).resultPosition();

        assertThat(actual).isEqualTo("-");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4})
    void _4이하일경우_한칸_전진합니다(final Integer input) {
        var movePosition = MovePosition.generateZeroPosition();

        var actual = movePosition.move(input).resultPosition();

        assertThat(actual).isEqualTo("");
    }
}