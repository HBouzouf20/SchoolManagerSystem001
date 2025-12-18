package org.itsup.models;

import org.itsup.models.enums.Gender;
import org.itsup.models.enums.Level;

public class Student extends Person {
    private String cne;
    private Level  level;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, String phone, String address, Gender gender, String cne, Level level) {
        super(firstName, lastName, email, phone, address, gender);
        this.cne = cne;
        this.level = level;
    }




    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }



    @Override
    public String toString() {
        return "Student{" +
                ", firstname='" + super.getFirstName() + '\'' +
                ", lastname=" + super.getLastName() +
                ", gender='" + super.getGender() + '\'' +
                ", address=" + super.getAddress() +
                ", reference='" + cne + '\'' +
                ", level=" + level +
                '}';
    }
}
