package org.itsup.controllers;

import org.itsup.models.Parent;
import org.itsup.models.enums.Gender;
import org.itsup.services.ParentService;

public class ParentController1 {
    public void execute() {
        ParentService ps = new ParentService();
        for (int i = 0; i < 10; i++) {
            Parent parent = new Parent();
            parent.setFirstName("First" + i);
            parent.setLastName("Last" + i);
            parent.setGender(Gender.MALE);
            parent.setAddress("Address" + i);
            parent.setCin("Cin" + i);
            ps.insertParent(parent);
        }

        //ps.showAllParents();

    }
}
