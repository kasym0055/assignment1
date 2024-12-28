package models;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Person> members;
    public School() {
        members = new ArrayList<Person>();
    }

    public void addMember(Person member) {
        members.add(member);
    }

}
