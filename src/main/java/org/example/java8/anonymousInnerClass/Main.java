package org.example.java8.anonymousInnerClass;

public class Main {
    public static void main(String[] args) {
        Employee employee = new SoftwareEngineer();
        System.out.println(employee.getSalary());


        // here we have used lamda expression as the Employee interface is functional interface
        EmployeeFuntionalInterface employee1 = ()->{
            return "100";
        };
        System.out.println(employee1.getSalary());

        //Anonymous Inner class example
        Employee employee2 = new Employee() {
            @Override
            public String getSalary() {
                return "200";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }
        };

        System.out.println(employee2.getSalary());

        //doSomething();
    }
    int a = 2;
    // Here a is an instance variable and it is accesible from lambda expression
    public  void doSomething(){

        EmployeeFuntionalInterface employee = ()->{
            a = 3; // here a which is an instance variable is accessible here
            int x =10;
            System.out.println(x);
            return "100";
        };

        EmployeeFuntionalInterface employee2 = new EmployeeFuntionalInterface() {
            int x = 10; // here x is an instance variable respective to Anonymous Inner class
            @Override
            public String getSalary() {
                System.out.println(this.x);
                return "500";
            }
        };
    }
}
