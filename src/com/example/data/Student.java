package com.example.data;

public class Student {
    private String name;
    private int rollNo;
    private double totalMarks;

    public Student() {
    }


    public Student(String name, int rollNo, double totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        System.out.println("To string of student called");
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
