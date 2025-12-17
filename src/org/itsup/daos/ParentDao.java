package org.itsup.daos;

import org.itsup.models.Parent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParentDao {
    /**
     * The @ID is the key of the map
     * @Id is @{@link Integer}
     * @Value is @{@link Parent}
     *<br/>
     * @return is @{@link Map}
     */
    private static final Map<Integer, Parent> parents = new HashMap<>(); //parent table
    private static int COUNTER;


    /**
     * Equivalent : Select * from parents;</br>
     * Retrieve all parents from our memory database
     * @return {@link List}
     */
    public List<Parent> findAllParents() {
        return parents.values().stream().toList();
    }
    /**
     * Equivalent : Select * from parents where id = {@id};</br>
     * Retrieve one parent from our memory database
     * @return {@link Parent}
     */
    public Parent findParentById(int id) {
        Parent parent = parents.get(id);
        if (parent == null)
            System.err.println("Parent not found with id: " + id);
        return parent;
    }

    public boolean insertParent(Parent p) {
        p.setId(++COUNTER);
        parents.put(p.getId(), p);
        /*for (Parent parent : parents) {
            if (parent.equals(p)) {
                System.err.println("ERROR: Parent sith cin : " + p.getCin() + " already exists");
                return false;
            }
        }
       // parents.add(p);*/
        return true;
    }

}
