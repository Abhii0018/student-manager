package com.Abhishek.student_manager;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int roll) {
        students.add(new Student(name, roll));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student searchStudent(int roll) {
        for (Student s : students) {
            if (s.getRoll() == roll) return s;
        }
        return null;
    }

    public void removeStudent(int roll) {
        students.removeIf(s -> s.getRoll() == roll);
    }
}
