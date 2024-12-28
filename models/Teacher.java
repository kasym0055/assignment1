package models;

public class Teacher extends Person {
    public String subject;
    public int yearsOfExperience;
    public int salary;


    public Teacher(String name, String surname, int age, String gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getYearsOfExperience(){
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public void raiseSalary(){

    }

    @Override
    public String toString() {
        return "I teach "+subject;
    }



}
