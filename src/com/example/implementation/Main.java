package com.example.implementation;

import com.example.data.Student;
import com.example.operation.HashSetDemo;

public class Main {
    public static void main(String[] args) {
        HashSetDemo hashSetDemo = new HashSetDemo();
        Student s1 = new Student();
        s1.setName("Vaibhav");
        s1.setRollNo(12);
        s1.setTotalMarks(500);

        Student s2 = new Student("Ramesh", 15, 350);
        Student s3 = new Student("Suresh", 20, 450);
        Student s4 = new Student("Ravi", 41, 200);

        System.out.println("hashSetDemo.addStudent(s1) = " + hashSetDemo.addStudent(s1));
        System.out.println("hashSetDemo.addStudent(s2) = " + hashSetDemo.addStudent(s2));
        hashSetDemo.addStudent(s3);
        hashSetDemo.addStudent(s4);
        System.out.println("Name and RollNo of student");
        hashSetDemo.display();

        System.out.println("-------------------------------------------------");

        System.out.println("hashSetDemo.deleteByRollNo(20) = " + hashSetDemo.deleteByRollNo(20));
        System.out.println("Name and RollNo of student");
        hashSetDemo.display();

        System.out.println("-------------------------------------------------");

    }
}
