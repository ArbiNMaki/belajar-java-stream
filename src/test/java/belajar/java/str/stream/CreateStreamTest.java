package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("Arbi");

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> streamString = Stream.of("Arbi", "Dwi", "Wijaya");
//        streamString.forEach(value -> {
//            System.out.println(value);
//        });
        // Method Lambda
        System.out.println("===== String =====");
        streamString.forEach(System.out::println);

        Stream<Integer> streamInteger = Stream.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("===== Integer =====");
        streamInteger.forEach(System.out::println);

        Stream<String> streamArray = Arrays.stream(new String[]{
                "Arbi",
                "Dwi",
                "Wijaya"
        });
        System.out.println("===== Array =====");
        streamArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collectionString = List.of("Arbi", "Dwi", "Wijaya");
        Stream<String> stringStream = collectionString.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream1 = Stream.generate(() -> "Arbi");
        Stream<String> stream2 = Stream.iterate("Arbi", String::toUpperCase);
        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);

//        stream1.forEach(System.out::println);
//        stream2.forEach(System.out::println);
//        iterate.forEach(System.out::println);
    }
}
