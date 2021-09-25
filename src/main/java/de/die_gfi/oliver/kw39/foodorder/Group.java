package de.die_gfi.oliver.kw39.foodorder;

import java.util.ArrayList;
import java.util.Arrays;

public class Group {

    String groupName;
    ArrayList<Person> members;

    public Group(String name, Person[] members) {
        this.groupName = name;
        this.members = new ArrayList(Arrays.asList(members));
    }

    public Group addMember(Person d) {
        this.members.add(d);
        return this;
    }

    public boolean contains(Person d) {
        return  this.members.contains(d);
    }
}
