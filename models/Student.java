package models;

import java.util.ArrayList;

public class Student extends Person {
    private int id;
    private static int id_gen;

    public Student() {

    }

    private void generateId() {
        id_gen++;
    }
    public ArrayList<Integer> grades;
    public Student(String name,String surname,int age, String gender, ArrayList<Integer> grades) {
        super(name,surname,age,gender);
        this.grades=grades;
        generateId();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGpa(){
        double gpa=0;
        for (Integer grade : grades) {
            gpa+=((double) grade /100)*4;
        }
        return gpa/grades.size();
    }
    @Override
    public String toString() {
        return "I am a student with ID "+id_gen;
    }

}
