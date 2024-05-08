package org.example.java8.LambdaExpressionExample;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getName());
//
//        // No need to define implementaion of Employee just to do a small amount of task
//
//        Employee employee1 = () -> "Software Engineer";
//        System.out.println(employee1.getName());

        MyClass myClass = new MyClass();
        Thread childThread = new Thread(myClass);
        childThread.start();
        for(int i=0;i<10;i++)
            System.out.println("Bye "+(i+1));


        //Using Lambda expression
        Runnable runnable = ()->{
          for(int i=0;i<10;i++)
              System.out.println("Using Lambda exp "+(i+1));
        };
        Thread childThread2 = new Thread(runnable);
        childThread2.start();
        for(int i=0;i<10;i++)
            System.out.println("Bye - after lambda "+(i+1));

    }
}
