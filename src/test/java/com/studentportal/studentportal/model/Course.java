package com.studentportal.studentportal.model;


import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "course_name")
    private String course_name ;


    @Column(name = "course_price")
    private  double course_price ;

    @Column(name = "course_description")
    private String course_description ;



    public Course() {
    }


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public double getCourse_price() {
        return course_price;
    }

    public void setCourse_price(double course_price) {
        this.course_price = course_price;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }
}
