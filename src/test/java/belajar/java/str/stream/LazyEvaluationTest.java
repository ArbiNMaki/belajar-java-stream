package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {
    @Test
    void testIntermediateOperations() {
        Stream<String> names = Stream.of("Arbi", "Dwi", "Wijaya");
        Stream<String> upperNames = names.map(name -> {
            System.out.println("Change " + name + " to UPPERCASE");
            return name.toUpperCase();
        });
        upperNames.forEach(upperName -> System.out.println("Print Name : " + upperName));
    }
}
