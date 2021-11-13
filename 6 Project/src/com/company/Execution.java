package com.company;

import java.io.IOException;

public class Execution {
    private Student[] studentsArray;
    public Execution(Student[] studentsArray){
        this.studentsArray = studentsArray;
    }
    public void executeFirst() throws IOException {
        InsertionSort sort = new InsertionSort(studentsArray);

        System.out.println("\n");
        sort.sort();
        sort.showStudentsArray();


    }
    public void executeSecond(){
        SortingStudentsByGPA ssbgpa = new SortingStudentsByGPA(studentsArray);
        ssbgpa.quickSort(0, studentsArray.length - 1);
        ssbgpa.showStudentsArray();
    }
}