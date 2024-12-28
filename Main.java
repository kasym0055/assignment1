import models.Person;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("src/okyshi.txt");
        File file2 =new File("src/teachers.txt");
        Scanner sc=new Scanner(file);
        Scanner sc2=new Scanner(file2);
        Student st=new Student();
        while(sc.hasNext()){
            String[] parts = sc.nextLine().split(" ");
            ArrayList<Integer> grades_list=new ArrayList<>();
            for (int i=4;i<parts.length;i++){
                grades_list.add(Integer.parseInt(parts[i]));
            }

            Student student=new Student(parts[0],parts[1],Integer.parseInt(parts[2]),parts[3],grades_list);
        }

        while(sc2.hasNext()){
            String[] parts2 = sc2.nextLine().split(" ");
            Teacher teacher=new Teacher(parts2[0],parts2[1],Integer.parseInt(parts2[2]),parts2[3],parts2[4],Integer.parseInt(parts2[5]),Integer.parseInt(parts2[6]));
            System.out.println(teacher.toString());
        }


    }
}