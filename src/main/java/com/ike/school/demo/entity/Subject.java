package com.ike.school.demo.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_subject")
    private Long idSubject;

    @Column(name="desc_subject", length = 50)
    private String descSubject;

    @JsonManagedReference(value="subject")
    @OneToMany(mappedBy = "subject", fetch=FetchType.EAGER)
    private List<ScoreStudent> lstScoreStudent;

    public Subject() {
    }

    public Subject(String descSubject) {
        this.descSubject = descSubject;
    }

    public Long getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Long idSubject) {
        this.idSubject = idSubject;
    }

    public String getDescSubject() {
        return descSubject;
    }

    public void setDescSubject(String descSubject) {
        this.descSubject = descSubject;
    }

    public List<ScoreStudent> getLstScoreStudent() {
        return lstScoreStudent;
    }

    public void setLstScoreStudent(List<ScoreStudent> lstScoreStudent) {
        this.lstScoreStudent = lstScoreStudent;
    }
}
