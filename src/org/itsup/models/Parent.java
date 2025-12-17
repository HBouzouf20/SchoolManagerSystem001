package org.itsup.models;

import org.itsup.models.enums.Gender;

import java.util.Objects;
import java.util.Set;

public class Parent extends Object{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String cin;
    private String phone;
    private String address;
    private Gender gender;
    private Set<Student>  students;

    public Parent() {
    }

    public Parent(String firstName, String lastName, String email, String cin, String phone, String address, Gender gender, Set<Student> students) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cin = cin;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Parent p) {
            return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.cin.equals(p.cin);
        }
        else  {
            System.err.println("ERROR: Parent object is not an instance of Parent");
            throw new IllegalArgumentException("The Object given is not an instance of Parent");
        }
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", students=" + students +
                '}';
    }
}
