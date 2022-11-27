package racingcar.domain;

public class MovePosition implements Comparable<MovePosition> {
    private final Integer position;

    private MovePosition(final Integer input) {
        this.position = input;
    }

    public static MovePosition generateZeroPosition() {
        return new MovePosition(0);
    }

    public MovePosition move(Integer input) {
        if (input < 4) {
            return new MovePosition(position);
        }
        return new MovePosition(position + 1);
    }

    public String resultPosition() {
        return "-".repeat(position);
    }

    @Override
    public int compareTo(MovePosition o) {
        return position.compareTo(o.position);
    }
}
