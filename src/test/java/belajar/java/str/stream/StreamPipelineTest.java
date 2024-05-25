package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testStreamPipeline() {
        Stream.of("Arbi", "Dwi", "Wijaya")
                .map(String::toUpperCase)
                .map(upper -> "Mr. " + upper)
                .forEach(System.out::println);
    }
}
