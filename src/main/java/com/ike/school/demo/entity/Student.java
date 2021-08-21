package com.ike.school.demo.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_student", nullable = false, unique = true)
    private Long idStudent;

    @Column(length = 50)
    private String nameStudent;

    @Column(length = 50)
    private String lastNameStudent;

    @Column(length = 50)
    private String motherLastNameStudent;

    @JsonManagedReference(value="student")
    @OneToMany(mappedBy = "student", fetch=FetchType.EAGER)
    private List<ScoreStudent> lstScoreStudent;

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    public String getMotherLastNameStudent() {
        return motherLastNameStudent;
    }

    public void setMotherLastNameStudent(String motherLastNameStudent) {
        this.motherLastNameStudent = motherLastNameStudent;
    }

    public List<ScoreStudent> getLstScoreStudent() {
        return lstScoreStudent;
    }

    public void setLstScoreStudent(List<ScoreStudent> lstScoreStudent) {
        this.lstScoreStudent = lstScoreStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", lastNameStudent='" + lastNameStudent + '\'' +
                ", motherLastNameStudent='" + motherLastNameStudent + '\'' +
                ", lstScoreStudent=" + lstScoreStudent +
                '}';
    }
}
