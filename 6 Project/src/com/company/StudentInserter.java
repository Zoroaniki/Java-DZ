package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentInserter {
    private Student[] studentsArray;
    private int arraySize;

    public StudentInserter(int arraySize){
        this.arraySize = arraySize;
        studentsArray = new Student[arraySize];
    }

    public Student[] getStudentsArray(){
        return studentsArray;
    }

    public void insertStudents() throws IOException {
        System.out.println("Enter student data in this format: id, name, gpa");
        for (int i = 0; i < arraySize; i++) {
            studentsArray[i] = makeNewStudent();
        }

    }

    private Student makeNewStudent() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String studentId = br.readLine();
        String studentName = br.readLine();
        String studentGradePointAverage = br.readLine();
        return new Student(Integer.parseInt(studentId),
                studentName, Float.parseFloat(studentGradePointAverage));
    }
}
