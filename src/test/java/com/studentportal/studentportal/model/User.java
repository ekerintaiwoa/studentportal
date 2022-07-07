package com.studentportal.studentportal.model;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id ;

  @Column(name = "name")
  private  String  name ;

  @Column(name = "username")
  private String username ;


  @Column(name = "password")
  private String password ;


   @Enumerated(EnumType.STRING)
  @Column(name = "role")
  private Role role ;


  public User() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
