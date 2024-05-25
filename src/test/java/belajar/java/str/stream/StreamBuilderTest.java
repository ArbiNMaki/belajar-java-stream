package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Arbi");
        builder.add("Dwi").add("Wijaya");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Arbi")
                .add("Dwi")
                .add("Wijaya")
                .build();
        stream.forEach(System.out::println);
    }
}
