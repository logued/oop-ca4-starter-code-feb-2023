package org.example;

import java.util.Set;
import java.util.TreeSet;

public class Institute {
    private String name;
    private Set<String> courses;

    public Institute(String name) {
        this.name = name;
        this.courses = null; /// Enter solution for Q5
    }

    public void addCourse( String course ){
        courses.add(course);
    }

    public String getName() { return name; }
    public Set<String> getCourses() { return courses; }

    @Override
    public String toString() {
        return "Institute{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
