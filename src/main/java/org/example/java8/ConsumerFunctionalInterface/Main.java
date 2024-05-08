package org.example.java8.ConsumerFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Vipul");
        // lets say you want to save your data in Database then we can use like consumer
        // which takes something and returns nothing
        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li)
                System.out.println(i);
        };


        // use of andThen --> just to run 2 consumer together
        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer i : li)
                System.out.println(i + 100);
        };
        listConsumer1.andThen(listConsumer2).accept(Arrays.asList(1, 2, 3, 4, 5));
        Consumer<List<Integer>> listConsumer = listConsumer1.andThen(listConsumer2);
        listConsumer.accept(Arrays.asList(1, 3, 5));
    }
}
