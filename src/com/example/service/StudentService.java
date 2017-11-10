package com.example.service;

import com.example.domain.Student;

public interface StudentService {
    boolean addStudent(Student student);
    boolean deleteStudent(String studentId);
    boolean modify(Student student);
    Student find(String studentId);
    Student find(String studentId, String password);
}
