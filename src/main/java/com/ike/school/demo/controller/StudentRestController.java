package com.ike.school.demo.controller;

import com.ike.school.demo.DemoApplication;
import com.ike.school.demo.caseuse.CreateStudent;
import com.ike.school.demo.entity.Student;
import com.ike.school.demo.entity.Subject;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/students")
public class StudentRestController {
    private CreateStudent createStudent;
    private Log LOGGER = LogFactory.getLog(DemoApplication.class);

    public StudentRestController(CreateStudent createStudent) {
        this.createStudent = createStudent;
    }

    @RequestMapping(path="/",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
    ResponseEntity<Student> newStudent(@RequestBody Student newStudent){
        LOGGER.info("valor del objecto studiante "+newStudent.toString());
        return new ResponseEntity<>(createStudent.save(newStudent), HttpStatus.CREATED);
    }
}
