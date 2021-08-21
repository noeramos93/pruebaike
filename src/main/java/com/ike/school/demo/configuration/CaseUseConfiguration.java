package com.ike.school.demo.configuration;

import com.ike.school.demo.caseuse.GetStudent;
import com.ike.school.demo.caseuse.GetStudentImplement;
import com.ike.school.demo.entity.Student;
import com.ike.school.demo.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CaseUseConfiguration {
    @Bean
    GetStudent getStudent(StudentService studentService){
        return new GetStudentImplement(studentService);
    }
}
