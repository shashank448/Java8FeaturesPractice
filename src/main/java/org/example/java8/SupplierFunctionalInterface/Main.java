package org.example.java8.SupplierFunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier1 = () -> 100;

        // lets try to use all functional interfaces
        if(predicate.test(supplier1.get())){
            consumer.accept(function.apply(supplier1.get()));
        }
    }

}
