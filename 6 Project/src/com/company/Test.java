package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    private Execution exe;
    private StudentInserter studentInserter;
    BufferedReader br;
    public Test(){
        //exe = new Execution(studentInserter.getStudentsArray());
        InputStreamReader isr = new InputStreamReader(System.in);
        this.br = new BufferedReader(isr);
    }
    public void start() throws IOException {

        int answer = 0;
        while(answer != 0){
            System.out.println("Students sorter\n1 - Insert Students\n2 - InsertionSort(id)\n3 - Quick sort(gpa)\n0 - Exit");
            answer = getAnswer();
            switch (answer){

                case 1:
                    System.out.println("Enter the amount of students");
                    String size = br.readLine();
                    studentInserter = new StudentInserter(Integer.parseInt(size));
                    studentInserter.insertStudents();
                    break;
                case 2:
                    exe = new Execution(studentInserter.getStudentsArray());
                    exe.executeFirst();
                    break;
                case 3:
                    exe = new Execution(studentInserter.getStudentsArray());
                    exe.executeSecond();
                    break;
                case 0:
                    return;

            }

        }
    }
    private int getAnswer() throws IOException {
        String answer = br.readLine();
        return Integer.parseInt(answer);
    }
}
