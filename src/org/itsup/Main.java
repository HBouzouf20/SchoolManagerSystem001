package org.itsup;

import org.itsup.dao.MemoryDatabase;
import org.itsup.enums.Gender;
import org.itsup.models.Subject;
import org.itsup.models.Teacher;
import org.itsup.services.SchoolService;
import org.itsup.services.SubjectService;
import org.itsup.statics.SubjectsData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();
        for (int i = 0; i < SubjectsData.SUBJCETS.length; i++) {
            schoolService.insertCourse(SubjectsData.SUBJCETS[i]);
        }
        Subject java = schoolService.searchCourseByTitle("Java");
        Subject oracle =  schoolService.searchCourseByTitle("ORacle");
        Teacher hamza = new Teacher();
        hamza.setGender(Gender.Male);
        hamza.setEmail("hamza@bouzouf.com");
        hamza.setPhone("0708078797");
        hamza.setFirstName("Hamza");
        hamza.setLastName("Bouzouf");
        hamza.setSubjects(new Subject[]{java, oracle});

        System.out.println(hamza);

        schoolService.insertTeacher(hamza);


    }
}