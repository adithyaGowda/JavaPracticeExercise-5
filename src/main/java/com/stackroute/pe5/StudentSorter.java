package com.stackroute.pe5;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {

        if (student1.getAge() == student2.getAge()) {

            if (student1.getName() == student2.getName()) {

                return student1.getId() - student2.getId();

            }

            else {

                return (student1.getName().compareTo(student2.getName()));
            }
        }

        else {

            return student1.getAge() - student2.getAge();
        }
    }
}
