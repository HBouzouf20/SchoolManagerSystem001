package org.itsup.models;

import org.itsup.models.enums.Gender;

public class Parent extends Person {
    private String cin;

    public Parent() {
    }

    public Parent(String firstName, String lastName, String email, String phone, String address, Gender gender, String cin) {
        super(firstName, lastName, email, phone, address, gender); //super => Person ; super() => Person() => constructor
        this.cin = cin;
    }

    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "firstname='" + super.getFirstName() + //Person.toString()
                "'; lastname='" + super.getLastName() + //Person.toString()
                "'; phone='" + super.getPhone() + //Person.toString()
                "'; gender='" + super.getGender() + //Person.toString()
                "'; cin='" + cin + '\'' +
                '}';
    }
}
