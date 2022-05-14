package com.company;
import java.util.Scanner;

public class Kk_19_Practice {
    public static void main(String[] args) {
        //Question
        // Write a program to find out whether a student is pass or fail;
        // if it requires a total of 40% and at least 33% in each subject to pass.
        // Assume 3 subjects and take marks as input from the user.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter maks obtained out of 100 ");
        System.out.print("Enter marks obtained in sub1 :: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks obtained in sub2 :: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks obtained in sub3 :: ");
        int sub3 = sc.nextInt();
        float perMarksObt = ((sub1+sub2+sub3)*100)/300.0f;
        System.out.println("you have scored "+perMarksObt+" % marks in the exam...");
        if (perMarksObt>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("You have passed in the exam..");
        }
        else {
            System.out.println("You have failed in the exam..");
        }




        //Question
        //:Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //        Income Slab	Tax
        //        2.5L – 5.0L  	5%
        //        5.0L – 10.0L 	20%
        //        Above 10.0L	30%

        Scanner at = new Scanner(System.in);
        System.out.print("Enter Your Annual Income For the tax calculation :: ");
        float annualIncome = at.nextFloat();
        if (annualIncome<250000){
            System.out.println("You do not have to pay tax to Government....");
        }
        else if (annualIncome>=250000 && annualIncome<500000){
            System.out.println("you have to pay 5% as tax amount");
        }
        else if (annualIncome>=500000 && annualIncome<1000000){
            System.out.println("you have to pay 10% as tax amount");
        }
        else if (annualIncome>=1000000 ){
            System.out.println("you have to pay 30% as tax amount");
        }

        System.out.println("what i would  like to do is");


        //Question
        //Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

        Scanner pt = new Scanner(System.in);
        System.out.print("Enter the day Number to find the day :: ");
        int dayNumber = pt.nextInt();
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }


        //Question
        //Write a Java program to find whether a year entered by the user is a leap year or not.
        Scanner yr = new Scanner(System.in);
        System.out.print("Enter the Year to be Checked :: ");
        int yearCheck = yr.nextInt();
        if (yearCheck%4==0 ){
            if (yearCheck%100==0){
                if(yearCheck%400==0){
                    System.out.println(yearCheck+" is a leap year..");
                }
                else {
                    System.out.println(yearCheck + " is not a leap year..");
                }
            }
            else {
                System.out.println(yearCheck + " is a leap year..");
            }
        }
        else{
            System.out.println(yearCheck+" is not a leap year..");
        }
    }
}
