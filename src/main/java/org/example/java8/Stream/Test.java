package org.example.java8.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,7,5,6,4,3,2,1,9,2,4,6);
        List<Integer> filteredList = list.stream().filter(n -> n % 2==0).collect(Collectors.toList());
        System.out.println(filteredList);

        System.out.println(filteredList.stream().map(x->x*x).collect(Collectors.toList()));

        // we can combine the above 2 operations

        List<Integer> evenSquare = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
        System.out.println(evenSquare);

        // Suppose we want unique values then make use of distinct

        List<Integer> evenSquareDistinct = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).distinct().collect(Collectors.toList());
        System.out.println(evenSquareDistinct);

        // Now suppose you want sorted Data then you can make use of Sorted ()
        List<Integer> evenSquareDistinctSorted = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).distinct().sorted().collect(Collectors.toList());
        System.out.println(evenSquareDistinctSorted);

        // ++Descending
        List<Integer> evenSquareDistinctSortedDesc = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).distinct().sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println(evenSquareDistinctSortedDesc);

        // use of skip which skips the element from the starting
        List<Integer> evenSquareDistinctSortedDescSkip = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .distinct()
                .sorted((a,b)->b-a).limit(4).skip(1)
                .collect(Collectors.toList());
        System.out.println(evenSquareDistinctSortedDescSkip);

        List<Integer> collect = Stream.iterate(0, x -> x + 1).limit(101).skip(1).filter(x -> x % 2 == 0).map(x -> x / 10).distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());
        System.out.println(collect);
    }

}
