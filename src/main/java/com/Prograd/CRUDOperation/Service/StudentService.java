package com.Prograd.CRUDOperation.Service;

import com.Prograd.CRUDOperation.Models.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student updateStudent(Student student,int id);
    void deleteStudent(int id);
}
