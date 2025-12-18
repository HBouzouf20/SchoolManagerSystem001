package org.itsup.models;

import org.itsup.models.enums.Gender;

import java.util.Set;

public class Teacher {
    private String cin;
    private Set<Subject> subjects;

    public Teacher() {
    }

    public Teacher(String cin, Set<Subject> subjects) {
        this.cin = cin;
        this.subjects = subjects;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
