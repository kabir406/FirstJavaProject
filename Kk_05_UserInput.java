package com.company;
import java.util.Scanner;

public class Kk_05_UserInput {
    public static void main(String[] args) {
        //we use scanner class for taking user input
        //first we have to import scanner class

        System.out.println("Taking user input");
        Scanner sc = new Scanner(System.in);    //creating scanner object sc
                        //system.in states that we will be taking input from keyboard

        System.out.print("Enter First Number::");
        int a = sc.nextInt();       //nextInt is used in taking next int input
//         float a = sc.nextFloat();     //nextFloat is used in taking next float input
        System.out.print("Enter second Number::");
        int b = sc.nextInt();
//        float b = sc.nextFloat();
        int sum = a+b;
        System.out.print("sum of both numbers are ::");
        System.out.println(sum);

        System.out.print("Enter a Number to check it is int or not::");
        boolean b1 = sc.hasNextInt();   //hasnextint takes a input to check input is int or not
        System.out.println(b1);

        System.out.print("enter a string::");
        String str1 = sc.next();            //sc.next by default takes first word as input not sentence or line
        System.out.println(str1);
        String str2 = sc.nextLine();        //sc.nextline by default takes complete sentence or line as input
        System.out.println(str2);



    }
}
