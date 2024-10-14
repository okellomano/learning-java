package org.eok;

public class Main {
    public static void main(String[] args) {

        System.out.println("Store student information:");

        Student john = new Student();
        Student ole = new Student(200, "Ole Masaai", 98.9f);
        Student random = new Student(john);

        john.changeName("Akudu");
        john.greeting();

        System.out.println(john);
        System.out.println(john.rollNo);
        System.out.println(john.name);
        System.out.println(john.marks);

        System.out.println(random.name);
    }
}

class Student {
    int rollNo;
    String name;
    float marks = 99;

    // add the values of the properties to the constructor
    Student () {
        this.rollNo = 20;
        this.name = "Student name";
        this.marks = 79.9f;
    }

    // calling a constructor from another constructor
//    Student () {
//        this (23, "Glen", 98.7f);
//    }
    Student (int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }
    void greeting(){
        System.out.println("Hello there, my name is: " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }
}