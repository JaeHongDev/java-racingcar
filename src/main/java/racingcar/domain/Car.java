package racingcar.domain;

public class Car implements Comparable<Car> {

    public static final String ERROR_CAR_NAME = "자동차의 이름은 5글자를 넘길 수 없습니다.";
    private static final Integer MAX_SIZE = 5;

    private final String name;
    private MovePosition movePosition;

    public Car(final String input) {
        validateNameSize(input.length());
        this.movePosition = MovePosition.generateZeroPosition();
        this.name = input;
    }

    private void validateNameSize(final Integer size) {
        if (size > MAX_SIZE) {
            throw new IllegalArgumentException(ERROR_CAR_NAME);
        }
    }

    public String move(int moveValue) {
        this.movePosition = this.movePosition.move(moveValue);
        return result();
    }

    private String result() {
        return this.name + " : " + movePosition.resultPosition();
    }

    @Override
    public int compareTo(Car o) {
        return movePosition.compareTo(o.movePosition);
    }

    public String getName() {
        return this.name;
    }
}
