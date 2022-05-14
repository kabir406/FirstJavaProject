package com.company;
import java.util.Scanner;

public class Kk_18_Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :: ");
        int age = sc.nextInt();
        switch (age) {      // switch statement can be replaced with enhanced switch statement
            case 12:
                System.out.println("You are going to become teenager..");
                break;
            case 18:
                System.out.println("You are going to become Adult now");
                break;
            case 23:
                System.out.println("You are ready for Marriage as you are 21 years old...");
                break;
            default:
                System.out.println("Enjoy your Life");
                    }
        }

    }

