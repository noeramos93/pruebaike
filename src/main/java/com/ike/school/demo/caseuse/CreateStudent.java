package com.ike.school.demo.caseuse;

import com.ike.school.demo.entity.Student;
import com.ike.school.demo.entity.Subject;
import com.ike.school.demo.service.StudentService;
import org.springframework.stereotype.Component;

@Component
public class CreateStudent {

    private StudentService studentService;

    public CreateStudent(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student save(Student newStudent){
        return studentService.save(newStudent);
    }
}
