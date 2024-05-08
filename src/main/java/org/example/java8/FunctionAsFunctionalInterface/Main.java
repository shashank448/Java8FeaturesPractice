package org.example.java8.FunctionAsFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> function1 = x->x.length();
        Function<String, String> function2 = x->x.substring(0,3);
        Function<List<Student>, List<Student>> studentWithVipAsPrefix = li -> {
          List<Student> result = new ArrayList<>();
          for(int i=0;i<li.size();i++){
              if(function2.apply(li.get(i).getName()).equalsIgnoreCase("vip")){
                  result.add(li.get(i));
              }
          }
          return result;
        };

        Student s1 = new Student("Vipul", 10);
        Student s2 = new Student("Viplav", 10);
        Student s3 = new Student("Sipul", 10);
        List<Student> li =Arrays.asList(s1, s2, s3);
        System.out.println(studentWithVipAsPrefix.apply(li));
    }
    private static class Student{
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name=" + name +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
