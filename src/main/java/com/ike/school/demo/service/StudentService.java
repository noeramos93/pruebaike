package com.ike.school.demo.service;

import com.ike.school.demo.entity.ScoreStudent;
import com.ike.school.demo.entity.Student;
import com.ike.school.demo.entity.Subject;
import com.ike.school.demo.repository.ScoreRepository;
import com.ike.school.demo.repository.StudentRepository;
import com.ike.school.demo.repository.SubjectRepository;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final Log LOG = LogFactory.getLog(StudentService.class);

    private StudentRepository studentRepository;
    private ScoreRepository scoreRepository;

    public StudentService(StudentRepository studentRepository, ScoreRepository scoreRepository) {
        this.studentRepository = studentRepository;
        this.scoreRepository = scoreRepository;
    }

    public Student save(Student newStudent){
        Student stu = studentRepository.save(newStudent);
        return stu;
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
