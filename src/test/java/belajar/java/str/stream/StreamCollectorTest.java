package belajar.java.str.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorTest {
    Stream<String> getStream() {
        return Stream.of("Arbi", "Dwi", "Wijaya");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        List<String> list = getStream().collect(Collectors.toList());
        System.out.println(list);
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);
    }

    @Test
    void testCollectorsMap() {
        List<String> names = List.of("Arbi", "Dwi", "Wijaya", "Bakugo", "Katsuki", "Nishikino", "Maki");

        Map<String, Integer> map = names.stream().collect(Collectors.toMap(name -> name, String::length));
        System.out.println(map);
    }
}
