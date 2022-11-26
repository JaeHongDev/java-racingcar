package racingcar.domain;

public class Car {
    private final String name;
    private Position position;

    public Car(String name) {
        this.name = name;
        this.position = Position.generateZeroPosition();
    }

    public void move(final Integer position) {
        this.position = this.position.move(position);
    }

    public String result() {
        return null;
    }
}
