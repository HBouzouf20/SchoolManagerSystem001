package org.itsup;

import org.itsup.controllers.ParentController1;
import org.itsup.controllers.ParentController2;
import org.itsup.models.Parent;
import org.itsup.services.ParentService;

public class Main {
    public static void main(String[] args) {
        ParentController1 pc = new ParentController1();
        ParentController2 pc2 = new ParentController2();
        ParentService ps = new ParentService();
        pc.execute();
        pc2.execute();

        ps.showAllParents();

        Parent p = new Parent();
p.getFirstName()

    }
}
