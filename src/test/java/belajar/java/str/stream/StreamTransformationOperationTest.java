package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamTransformationOperationTest {
    @Test
    void testMapOperation() {
        Stream.of("Arbi", "Dwi", "Wijaya")
                .map(String::toUpperCase)
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    void testFlatMapOperation() {
        Stream.of("Arbi", "Dwi", "Wijaya")
                .map(String::toUpperCase)
                .flatMap(upperName -> Stream.of(upperName, upperName.length()))
                .forEach(System.out::println);
    }
}
