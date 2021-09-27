/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Govinda
 */
public class Student {
    private String studentName,address,city,email;
    private Integer age;
    private Double CNIC;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getCNIC() {
        return CNIC;
    }

    public void setCNIC(Double CNIC) {
        this.CNIC = CNIC;
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", address=" + address + ", city=" + city + ", email=" + email + ", age=" + age + ", CNIC=" + CNIC + '}';
    }
    
}
