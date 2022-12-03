package com.example.students.entity;


import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lessons")
public class Lessons extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lessonsName")
    private String lessonsName;

    @Column(name = "lessonsTime")
    private Date lessonsTime;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Students students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLessonsName() {
        return lessonsName;
    }

    public void setLessonsName(String lessonsName) {
        this.lessonsName = lessonsName;
    }

    public Date getLessonsTime() {
        return lessonsTime;
    }

    public void setLessonsTime(Date lessonsTime) {
        this.lessonsTime = lessonsTime;
    }




    public Lessons() {
    }

    public Lessons(Long id, String lessonsName, Date lessonsTime) {
        this.id = id;
        this.lessonsName = lessonsName;
        this.lessonsTime = lessonsTime;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "id=" + id +
                ", lessonsName='" + lessonsName + '\'' +
                ", lessonsTime=" + lessonsTime +
                '}';
    }
}
