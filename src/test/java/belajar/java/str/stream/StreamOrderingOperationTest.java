package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class StreamOrderingOperationTest {
    @Test
    void testSorted() {
        List<String> names = List.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista");
        names.stream().sorted().forEach(System.out::println);
    }

    @Test
    void testSortedComparator() {
        List<String> names = List.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
