package org.example.java8.optional;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<String> name = getName(2);
        if(name.isPresent()){
            System.out.println(name.get());
        }
        name.ifPresent(x -> System.out.println(x));
        // Here the most important thing to note is here we have not used
        //get, the value which is passed in consumer within the ifPresent(.....)
        // is the type of value which is present in Optional i.e.
        // Optional<String> --> here the value passed if of type String in
        // consumer within the ifPresent method

        // we can replace the above method call with method reference as well

        name.ifPresent(System.out::println);

        String nameToBeUsed = name.isPresent()?name.get():"NA";
        System.out.println(nameToBeUsed);

        nameToBeUsed = name.orElse("NA");
        System.out.println(nameToBeUsed);

        // there is one more method which we can chain i.e. orElseGet which take a Supplier
        nameToBeUsed = name.orElseGet(()->"Shyam");
        System.out.println(nameToBeUsed);

        //Note : Differene between orElse and orElseGet --> if you want to do something small then
        // use orElse and if you want to do something big then use orElseGet()

        // orElseThrow : it is used to throw an Exception

        nameToBeUsed = name.orElseThrow(()-> {
            throw new RuntimeException(" Could not find name");
        });

        // There is one more way, instead of trying to fetch the value out of the box from the optional we
        // can work with the optional as well
        // For example

        Optional<String> optional = getName(2);
        Optional<Integer> optionalI = optional.map(x-> x.length());
        optionalI.ifPresent(System.out::println);
        
    }
    private static Optional<String> getName(int id){
        // searches the name corresponding to id in the table from Database
        // Result could be of 2 types, either we will get the name or we will not get the name
        //return "Ram";

        //return null; // if we return null and when in main method, getName().toUpperCase() is called,
        // it will give us null pointer exception

        String name = "Ram";
        return Optional.ofNullable(name);

        // now if you want to return Optional of null type
        // you can do like : return Optional.empty()

        // we can also use Optional.of() but the problem is again it can return null of name is null
        // For example
        // String name = null;
        // return Optional.of(name); --> this will again throw null Pointer exception
        // to avoid the NPE, we can use like return Optional.ofNullable(name);
        // this will ensure that the Optional which we are returning can also hold null


    }
}
