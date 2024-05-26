package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamCheckOperationTest {
    @Test
    void testAnyMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .anyMatch(number -> number > 9);
        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .allMatch(number -> number > 0);
        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        boolean match = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .noneMatch(number -> number > 11);
        System.out.println(match);
    }
}
