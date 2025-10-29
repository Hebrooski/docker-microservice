package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "employees")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "employeeid")
  private Integer id;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "employeename")
  private String employeeName;
  
  @Column(name = "lastname")
  private String lastName;

  @Column(name = "title")
  private String title;

  @Column(name = "country")
  private String country;

  @Column(name = "city")
  private String city;

  @Column(name = "address")
  private String address;

  @Column(name = "homephone")
  private String homePhone;

  @Column(name = "notes")
  private String notes;
  
  private Employee() {}
  
  public Employee(String firstName, String employeeName, String lastName, String title, String country, String city, String address, String homePhone, String notes) {
    this.firstName = firstName;
    this.employeeName = employeeName;
    this.lastName = lastName;
    this.title = title;
    this.country = country;
    this.city = city;
    this.address = address;
    this.homePhone = homePhone;
    this.notes = notes;
  }
  
  public Integer getId() {
    return this.id;
  }
  
  public String getFirstName() {
    return this.firstName;
  }

  public String getEmployeeName() {
    return this.employeeName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getTitle(){
    return this.title;
  }

  public String getCountry(){
    return this.country;
  }

  public String getCity(){
    return this.city;
  }

  public String getAddress(){
    return this.address;
  }
    
  public String getHomePhone(){
    return this.homePhone;
  }
  
  public String getNotes(){
    return this.notes;
  }

}