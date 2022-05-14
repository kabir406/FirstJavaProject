package com.company;
import java.util.Scanner;

public class kk_12_Practice_2 {
    public static void main(String[] args) {
        // Question 1
        //What will be the result of the following Expression
        //  float a = 7/4*9/2
        float a = 7/4*9/2;  //here result will be 4 bcz 7/4 will be 1 bcz int/int=int
            // = 1*9/2
            // = 9/2
            // = 4
        System.out.println("The value of a is :: "+a);
        float aa = 7/4f*9/2f;       //now it will be float division
            // = 1.75*9/2
            // = 15.75/2
            // = 7.875
        System.out.println("The value of aa is :: "+aa);



        //Question 2
        //Write a java program to Encrypt a grade by adding 8 to it ,then decrypt it to show the correct grade.
        Scanner dd = new Scanner(System.in);
        System.out.print("Please enter your Grade :: ");
        char md = dd.next().charAt(0);
        char et = (char)(md+8);
        System.out.println("Encrypted grade is :: "+et);
        System.out.println("Correct grade is :: "+md);



        //Question 3
        //wap to compare whether user input number is greater than 100 or not.
        System.out.print("Enter a number to compare with 100 :: ");
        int no1 = dd.nextInt();
        System.out.println(no1>100);




    }
}
