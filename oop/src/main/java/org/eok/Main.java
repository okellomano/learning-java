package org.eok;

public class Main {
    public static void main(String[] args) {

        System.out.println("Store student information:");

        Student john = new Student();
        john.marks = 90.8f;
        john.name = "John Akhudu";
        john.rollNo = 1328;

        System.out.println(john);
        System.out.println(john.rollNo);
        System.out.println(john.name);
        System.out.println(john.marks);
    }
}

class Student {
    int rollNo;
    String name;
    float marks = 99;
}