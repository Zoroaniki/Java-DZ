package com.company;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Student[] students;

    public SortingStudentsByGPA(Student[] students){
        this.students = students;
    }

    public void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);

            quickSort(begin, partitionIndex-1);
            quickSort(partitionIndex+1, end);
        }
    }
    private int partition( int begin, int end) {
        Student pivot = students[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (compare(students[j],pivot) >= 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;


            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[end];
        students[end] = temp;


        return i+1;
    }
    private void swapStudents(Student s1, Student s2){
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }
    public void showStudentsArray(){
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getGpa() < s2.getGpa()){
            return 1;
        }
        else if(s1.getGpa() == s2.getGpa())
        {
            return 0;
        }
        else{
            return -1;
        }

    }
}
