package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamFilteringOperationTest {
    @Test
    void testFilteringOperation() {
        Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Bakugo", "Katsuki", "Nishikino", "Maki")
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);
    }

    @Test
    void testDistinctOperation() {
        Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Bakugo", "Katsuki", "Nishikino", "Maki")
//                .filter(name -> name.length() > 3)
                .distinct()
                .forEach(System.out::println);
    }
}
