package com.company;

public class Kk_15_Practice {
    public static void main(String[] args) {
        //question 1
        // Write a Java program to convert a string to lowercase.
        String a1 = "HELLO";
        System.out.println("the HELLO in lowercase is :: "+a1.toLowerCase());

        //Question 2
        // Write a Java program to replace spaces with underscores.
        String a2 = "Hii How Are you";
        System.out.println(a2.replaceAll(" ","_"));

        //Question 3
        // Write a Java program to fill in a letter template which looks like below:
        // letter =  Dear < name >, Thanks a lot
        // Replace < name > with a string (some name)
        String letter =  "Dear < name >, Thanks a lot";
        System.out.println(letter.replace("< name >","KABIR"));

        //Question 4
        // Write a Java program to detect double and triple spaces in a string.
        String ns = "hlo   buddy";
        System.out.println(ns.indexOf("  "));
        System.out.println(ns.indexOf("   "));

        //Question 5
        // Write a program to format the following letter using escape sequence characters.
        // Letter = Dear Kabir, This Java Course is nice. Thanks
        String ns2 = "Dear Kabir,\n\t This Java Course is Nice.\n Thanks!";
        System.out.println(ns2);

    }
}
