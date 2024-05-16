package org.example.java8.Stream;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // here we have written different ways of creating Streams

        List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
        Stream<String> myStream = list.stream();

        String[] array = {"Banana", "Apple", "Cherry"};
        Stream<String> stream = Arrays.stream(array);

        Stream<String> fruits = Stream.of("Banana", "Apple", "Cherry");

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
        Stream<String> limit1 = Stream.generate(() -> "hello").limit(5);

    }
}
