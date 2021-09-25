package de.die_gfi.oliver.kw39.foodorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Group {

    String groupName;
    ArrayList<Person> members;

    public Group(String name, ArrayList<Person> members) {
        this.groupName = name;
        this.members = members;
    }

    public Group addMember(Person d) {
        this.members.add(d);
        return this;
    }

    public boolean contains(Person d) {
        return  this.members.contains(d);
    }
}
