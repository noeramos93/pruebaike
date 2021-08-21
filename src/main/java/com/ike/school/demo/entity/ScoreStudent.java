package com.ike.school.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="score_student_subject")
public class ScoreStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_score_student")
    private Long idScoreStudent;

    @Transient
    private Long idStudent;

    @Transient
    private Long idSubject;

    @Column(name="score")
    private double scoreStudent;

    @ManyToOne
    @JsonBackReference(value = "student")
    @JoinColumn(name="id_student",insertable = true, nullable = false)
    private Student student;

    @ManyToOne
    @JsonBackReference(value = "subject")
    @JoinColumn(name="id_subject",insertable = true, nullable = false)
    private Subject subject;

    public ScoreStudent() {
    }

    public ScoreStudent(Long idStudent, Long idSubject, double scoreStudent) {
        this.idStudent = idStudent;
        this.idSubject = idSubject;
        this.scoreStudent = scoreStudent;
    }

    public ScoreStudent(Long idStudent, Subject subject, double scoreStudent) {
        this.idStudent = idStudent;
        this.subject = subject;
        this.scoreStudent = scoreStudent;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Long getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Long idSubject) {
        this.idSubject = idSubject;
    }

    public double getScoreStudent() {
        return scoreStudent;
    }

    public void setScoreStudent(double scoreStudent) {
        this.scoreStudent = scoreStudent;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
