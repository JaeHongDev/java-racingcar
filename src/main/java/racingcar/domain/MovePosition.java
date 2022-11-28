package racingcar.domain;

public class MovePosition implements Comparable<MovePosition> {
    private static final Integer DIVISION_NUMBER = 4;
    private static final Integer MOVE_NUMBER = 1;
    private static final String DASH = "-";
    
    private final Integer position;

    private MovePosition(final Integer input) {
        this.position = input;
    }

    public static MovePosition generateZeroPosition() {
        return new MovePosition(0);
    }

    public MovePosition move(Integer input) {
        if (input < DIVISION_NUMBER) {
            return new MovePosition(position);
        }
        return new MovePosition(position + MOVE_NUMBER);
    }

    public String resultPosition() {
        return DASH.repeat(position);
    }

    @Override
    public int compareTo(MovePosition o) {
        return position.compareTo(o.position);
    }
}
