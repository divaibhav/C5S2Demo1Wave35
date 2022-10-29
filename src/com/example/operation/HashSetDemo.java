package com.example.operation;

import com.example.data.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    private Set<Student> studentSet = new HashSet<>();

   /* public HashSetDemo(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public HashSetDemo() {
        studentSet = new HashSet<>();
    }*/
    public boolean addStudent(Student student){
        return studentSet.add(student);
    }
    public void display(){
        Iterator<Student> iterator = studentSet.iterator();
        System.out.println("Name" + "\t\t" + "rollNo");
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getName() + "\t\t" + student.getRollNo());
        }
    }
    public Student deleteByRollNo(int rollNo){
        Student response = null;
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getRollNo() == rollNo){
                iterator.remove();
                response = student;
                break;
            }
        }

       return response;
    }
}
