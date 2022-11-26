package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Participants {
    private final List<Car> cars;

    public Participants(final String input) {
        this.cars = Arrays.stream(input.split(":"))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public String move(List<Integer> listNumber) {
        for (int i = 0; i < listNumber.size(); i++) {
            this.cars.get(i).move(listNumber.get(i));
        }
        return this.result();
    }

    private String result() {
        return cars.stream().map(car::result).collect(Collectors.joining("\n"));
    }
}
