package racingcar.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Participants {
    private final List<Car> participants;

    public Participants(String s) {
        this.participants = Arrays.stream(s.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public String moveAll(MoveMaker moveMaker) {
        List<Integer> moveNumbers = moveMaker.generate(participants.size());
        AtomicInteger atomicInteger = new AtomicInteger();
        return participants.stream()
                .map(car -> car.move(moveNumbers.get(atomicInteger.getAndIncrement())))
                .collect(Collectors.joining("\n"));
    }

    public String getWinner() {
        var maxPositionCar = participants.stream().max(Comparator.comparing(car -> car)).get();
        return participants.stream().filter(car -> car.equals(maxPositionCar)).map(Car::getName)
                .collect(Collectors.joining(","));
    }
}
