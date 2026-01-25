package javaBasics.challenges.Challenge04TheUniversityCourseEnrollmentSystem;

import java.util.HashSet;
import java.util.Set;

public class student {
    private String name;
    private int id;
    private Set<String> enrolledCourses;

    public student(String name, int id){
        this.name=name;
        this.id=id;

        this.enrolledCourses= new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Set<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void addCourses(String course){
        enrolledCourses.add(course);
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", courses=" + enrolledCourses +
                '}';
    }

}
