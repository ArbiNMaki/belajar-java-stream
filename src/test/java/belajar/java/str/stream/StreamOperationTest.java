package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void testMapStream() {
        List<String> names = List.of("Arbi", "Dwi", "Wijaya");
        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(String::toUpperCase);
        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
