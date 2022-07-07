package com.studentportal.studentportal.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int  id ;


@ManyToOne
@JoinColumn(name ="course_id" ,referencedColumnName = "id")
 private  Course course ;




@ManyToOne
@JoinColumn(name = "user_id",referencedColumnName = "id")
 private User user ;



 @Column(name = "registerationDate")
 private LocalDateTime  registerationDate ;


 public Transaction() {
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public Course getCourse() {
  return course;
 }

 public void setCourse(Course course) {
  this.course = course;
 }

 public User getUser() {
  return user;
 }

 public void setUser(User user) {
  this.user = user;
 }

 public LocalDateTime getRegisterationDate() {
  return registerationDate;
 }

 public void setRegisterationDate(LocalDateTime registerationDate) {
  this.registerationDate = registerationDate;
 }
}
