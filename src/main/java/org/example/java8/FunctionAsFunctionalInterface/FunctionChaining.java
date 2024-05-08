package org.example.java8.FunctionAsFunctionalInterface;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {

        Function<String, String> function1= x->x.toUpperCase();
        Function<String, String> function2 = x->x.substring(0,3);
        Function<String, String> function3 = function1.andThen(function2);
        System.out.println(function3.apply("Vipul"));
        // Or we can simply write
        System.out.println(function1.andThen(function2).apply("Vipul"));

        // compose is opposite of andThen

        // Identity
        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Vipul"));
    }
}
