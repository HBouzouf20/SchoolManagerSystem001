package org.itsup.dao;

import org.itsup.models.Parent;
import org.itsup.models.Student;
import org.itsup.models.Subject;
import org.itsup.models.Teacher;

public class MemoryDatabase {
    public static Parent[] PARENTS_T = new  Parent[10];
    public static Student[] STUDENTS_T = new  Student[10];
    public static Subject[] SUBJECTS_T =  new  Subject[6];
    public static Teacher[] TEACHERS_T = new  Teacher[6]; //1 teacher => 1 subject
}
