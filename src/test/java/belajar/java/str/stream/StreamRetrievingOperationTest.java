package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamRetrievingOperationTest {
//    @Test
//    void testRetrievingOperation() {
//       List<String> names = List.of("Arbi", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista");
//
//        names.stream().limit(2).forEach(System.out::println);
//        names.stream().skip(2).forEach(System.out::println);
//        names.stream().takeWhile(name -> name.length() != 3).forEach(System.out::println);
//        names.stream().dropWhile(name -> name.length() < 3).forEach(System.out::println);
//    }

    @Test
    void testLimit() {
        Stream.of("Arbi", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista")
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        Stream.of("Arbi", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista")
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista")
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista")
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> names = Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista").findAny();
        names.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst() {
        Optional<String> names = Stream.of("Arbi", "Maki", "Dwi", "Wijaya", "Katsuki", "Maki", "Kalista").findFirst();
        names.ifPresent(System.out::println);
    }
}
