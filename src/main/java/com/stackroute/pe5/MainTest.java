package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setId(1);
        s1.setName("john");
        s1.setAge(20);

        s2.setId(2);
        s2.setName("berlin");
        s2.setAge(22);

        s3.setId(3);
        s3.setName("tokyo");
        s3.setAge(25);

        s4.setId(4);
        s4.setName("arturo");
        s4.setAge(21);

        s5.setId(5);
        s5.setName("rio");
        s5.setAge(18);


        ArrayList<Student> list = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        StudentSorter studentSorter = new StudentSorter();


        Collections.sort(list, studentSorter);

        System.out.println(list);
    }
}
