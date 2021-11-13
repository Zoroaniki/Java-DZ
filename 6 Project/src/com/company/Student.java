package com.company;

public class Student {

    private int iDNumber;
    private String studentName;
    private float gradePointAverage;

    public Student(int id, String studentName, float grade){
        iDNumber = id;
        this.studentName = studentName;
        gradePointAverage = grade;
    }

    public void setID(int id){
        iDNumber = id;
    }

    public void setGpa(int grade){
        gradePointAverage  = grade;
    }

    public int getID(){
        return iDNumber;
    }

    public String toString(){
        return iDNumber + " " + studentName + " " + gradePointAverage;
    }

    public float getGpa(){
        return gradePointAverage;
    }


}