package org.example.java8.UnaryAndBinaryOperator;


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> x * x;
        Function<String, String> function2 = s -> s.toLowerCase();
        UnaryOperator<Integer> unaryOperator1 = x->x*x;
        UnaryOperator<String> unaryOperator2 = s -> s.toLowerCase();
        System.out.println(unaryOperator1.apply(2));
        System.out.println(unaryOperator2.apply("PhysIcs"));
        // Unary Operator is special case of Function in which the input type and return type are same

        BiFunction<String, String, String> biFunction = (x,y)->x+" "+y;
        System.out.println(biFunction.apply("Ram","Sahu"));
        BinaryOperator<String> binaryOperator = (x,y)->x+" "+y;
        System.out.println(binaryOperator.apply("Shyam","Sahu"));
        // BinaryOperator is special case of BiFunction
    }
}
