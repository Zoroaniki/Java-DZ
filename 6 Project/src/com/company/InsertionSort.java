package com.company;

import java.util.Arrays;

public class InsertionSort {

    private Student[] students;

    public InsertionSort(Student[] students){
        this.students = students;
    }

    public void sort(){
        for(int left = 0; left < students.length; left++){
            Student chosenStudent = students[left];
            int i = left - 1;
            for(; i >= 0; i--){
                if(chosenStudent.getID() < students[i].getID()){
                    students[i + 1] = students[i];
                }
                else{
                    break;
                }
            }
            students[i + 1] = chosenStudent;
        }

    }
    public void showStudentsArray(){
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}