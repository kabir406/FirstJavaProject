package com.company;
import java.util.Scanner;

public class Kk_Exercise_1 {
    public static void main(String[] args) {
        //Write a program to calculate percentage of a given student in CBSE Board Exam .
        //His marks of 5 subject to be taken as input then percentage of marks scored to be printed along with total marks scored.

        Scanner mk = new Scanner(System.in);
        System.out.print("enter maks scored in subject 1 out of 100 :: ");
        int sub1 = mk.nextInt();
        System.out.print("enter maks scored in subject 2 out of 100 :: ");
        int sub2 = mk.nextInt();
        System.out.print("enter maks scored in subject 3 out of 100 :: ");
        int sub3 = mk.nextInt();
        System.out.print("enter maks scored in subject 4 out of 100 :: ");
        int sub4 = mk.nextInt();
        System.out.print("enter maks scored in subject 5 out of 100 :: ");
        int sub5 = mk.nextInt();

        int sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total marks scored out of 500 is :: " + sum);
        int percent = (sum*100)/500;
        System.out.println("Percentage scored in Exam is :: " + percent + " %");

        // instead of int here in the program FLOAT should be used as data type
        // bcz int divided by int gives int so float percent will not be calculated
    }
}
