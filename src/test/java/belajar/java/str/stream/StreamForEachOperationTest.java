package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamForEachOperationTest {
    @Test
    void testPeek() {
        Stream.of("Arbi", "Dwi", "Wijaya")
                .peek(name -> System.out.println("BEFORE UPPER : " + name))
                .map(String::toUpperCase)
                .peek(upper -> System.out.println("TO UPPER : " + upper))
                .forEach(name -> System.out.println("NOW = " + name));
    }
}
