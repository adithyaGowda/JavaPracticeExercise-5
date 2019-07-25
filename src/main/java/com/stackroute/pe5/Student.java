package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {


    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

 class StudentSorter implements Comparator<Student>{

    @Override
     public int compare(Student student1, Student student2){


         return 0;
    }


}

class Maintest {

    public String testMethod(int x){


        if(x == 1)
            return "testing";

        return null;
    }

}
