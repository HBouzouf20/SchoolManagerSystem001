package org.itsup.services;

import org.itsup.daos.ParentDao;
import org.itsup.models.Parent;

import java.util.List;

public class ParentService {
    private ParentDao parentDao;

    public ParentService() {
        parentDao = new ParentDao();
    }

    public List<Parent> getAllParents() {
        return parentDao.findAllParents();
    }
    public void showAllParents() {
        List<Parent> parents = parentDao.findAllParents();
        if (parents.isEmpty()) {
            System.err.println("No parents found");
        }
        for (Parent p : parents) {
            System.out.println(p);
        }

    }

    public boolean insertParent(Parent p) {
        System.out.println("Inserting parent " + p.getCin());
        return parentDao.insertParent(p);
    }
}
