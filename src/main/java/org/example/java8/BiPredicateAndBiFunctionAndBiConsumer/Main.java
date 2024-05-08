package org.example.java8.BiPredicateAndBiFunctionAndBiConsumer;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(biPredicate.test(2, 4));

        BiPredicate<String, Integer> biPredicate1 = (x,y)-> x.length()==y;
        System.out.println(biPredicate1.test("Vipul", 5));

        // Function and BiFunction
        Function<String, Integer> function = x->x.length();
        BiFunction<String, String, Integer> biFunction = (x,y)->x.length()+y.length();
        System.out.println(biFunction.apply("Aman", "Sahu"));

        // Consumer and BiConsumer
        Consumer<String> consumer = x-> System.out.println(x);
        consumer.accept("Aman");

        BiConsumer<Integer, Integer> biConsumer = (x,y)-> System.out.println(x+" "+y);
        biConsumer.accept(5,6);

        // BiSupplier does not exist as a method cannot return 2 things

    }
}
