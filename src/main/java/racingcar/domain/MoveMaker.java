package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveMaker {
    private final MoveGenerator moveGenerator;

    public MoveMaker(MoveGenerator moveGenerator) {
        this.moveGenerator = moveGenerator;
    }

    public List<Integer> generate(int size) {
        return Stream.generate(moveGenerator::generate)
                .limit(size)
                .collect(Collectors.toList());
    }
}
