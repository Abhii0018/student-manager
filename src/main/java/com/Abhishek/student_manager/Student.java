package com.Abhishek.student_manager;

public class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', roll=" + roll + "}";
    }
}
