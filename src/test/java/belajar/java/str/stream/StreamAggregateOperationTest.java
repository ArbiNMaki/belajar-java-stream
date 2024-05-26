package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAggregateOperationTest {
    @Test
    void testAggregateMin() {
        Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista")
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testAggregateMax() {
        Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista")
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testAggregateCount() {
        long count =  Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista").count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var result = Stream.of(1, 2, 3, 4, 5).reduce(1, (value, item) -> value * item);
        System.out.println(result);
    }
}
