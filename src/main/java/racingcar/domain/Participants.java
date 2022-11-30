package racingcar.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Participants {
    public static final String ERROR_DID_NOT_PARTICIPANTS = "참여자가 존재하지 않습니다.";
    private static final String SPLIT_NAME_DELIMITER = ",";
    private static final String NEW_LINE_DELIMITER = "\n";

    private final List<Car> participants;

    public Participants(String s) {
        this.validateParticipantsCount(s);
        this.participants = Arrays.stream(s.split(SPLIT_NAME_DELIMITER))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    private void validateParticipantsCount(String s) {
        if (s.isBlank() || s.isEmpty()) {
            throw new IllegalArgumentException(ERROR_DID_NOT_PARTICIPANTS);
        }
    }

    public String moveAll(MoveMaker moveMaker) {
        List<Integer> moveNumbers = moveMaker.generate(participants.size());
        AtomicInteger atomicInteger = new AtomicInteger();

        return participants.stream()
                .map(car -> car.move(moveNumbers.get(atomicInteger.getAndIncrement())))
                .collect(Collectors.joining(NEW_LINE_DELIMITER));
    }

    public String getWinner() {
        var maxPositionCar = participants.stream()
                .max(Comparator.comparing(car -> car))
                .orElseThrow(() -> new IllegalStateException(ERROR_DID_NOT_PARTICIPANTS));

        return participants.stream()
                .filter(car -> car.compareTo(maxPositionCar) == 0)
                .map(Car::getName)
                .collect(Collectors.joining(SPLIT_NAME_DELIMITER));
    }
}
