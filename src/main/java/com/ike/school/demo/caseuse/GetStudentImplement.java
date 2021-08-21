package com.ike.school.demo.caseuse;

import com.ike.school.demo.entity.Student;
import com.ike.school.demo.service.StudentService;

import java.util.List;

public class GetStudentImplement implements GetStudent {

    private StudentService studentService;

    public GetStudentImplement(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAllStudent();
    }
}
