package racingcar.domain;

public class Position {
    private final Integer position;

    public Position(int position) {
        this.position = position;
    }

    public static Position generateZeroPosition() {
        return new Position(0);
    }

    public Position move(Integer position) {
        if (position < 4) {
            return new Position(position + 1);
        }
        return new Position(position);
    }
}
