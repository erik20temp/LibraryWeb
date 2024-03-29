package com.erik.libraryweb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String studentFirstName;
    private String studentLastName;
    private String studentAddress;
    private String studentStreet;
    private String studentCity;
    private String studentPLZ;
    private String studentEmail;
    private String studentTel;
    private LocalDate studentDob;
    private Integer studentAge; // Age is calculated in getAge
    private Integer countOfBooks;

    // How many Books has a Student
    /*
        count Books from DB
    */
    // What a Books has a Student
    /*
        display students Book with
        when he rent a Book
        What is a date of return
        How many days left
        
     */


    public Student() {
    }

    public Student(Long id, String studentFirstName, String studentLastName, String studentAddress, String studentStreet, String studentCity, String studentPLZ, String studentEmail, String studentTel, LocalDate studentDob) {
        this.id = id;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAddress = studentAddress;
        this.studentStreet = studentStreet;
        this.studentCity = studentCity;
        this.studentPLZ = studentPLZ;
        this.studentEmail = studentEmail;
        this.studentTel = studentTel;
        this.studentDob = studentDob;
    }

    public Student(String studentFirstName, String studentLastName, String studentAddress, String studentStreet, String studentCity, String studentPLZ, String studentEmail, String studentTel, LocalDate studentDob) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAddress = studentAddress;
        this.studentStreet = studentStreet;
        this.studentCity = studentCity;
        this.studentPLZ = studentPLZ;
        this.studentEmail = studentEmail;
        this.studentTel = studentTel;
        this.studentDob = studentDob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentStreet() {
        return studentStreet;
    }

    public void setStudentStreet(String studentStreet) {
        this.studentStreet = studentStreet;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public String getStudentPLZ() {
        return studentPLZ;
    }

    public void setStudentPLZ(String studentPLZ) {
        this.studentPLZ = studentPLZ;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentTel() {
        return studentTel;
    }

    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel;
    }

    public Integer getCountOfBooks() {
        return countOfBooks;
    }

    public void setCountOfBooks(Integer countOfBooks) {
        this.countOfBooks = countOfBooks;
    }

    public LocalDate getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(LocalDate studentDob) {
        this.studentDob = studentDob;
    }

    public Integer getStudentAge() {
        return Period.between(this.studentDob, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentStreet='" + studentStreet + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentPLZ='" + studentPLZ + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentTel='" + studentTel + '\'' +
                ", studentDob='" + studentDob + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", countOfBooks=" + countOfBooks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id != null ? id.equals(student.id) : student.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }



}
