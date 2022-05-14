package com.company;

public class Kk_13_String {
    public static void main(String[] args) {
        char as = 'd';
        System.out.printf("%c",as);
        System.out.println();

        //  %d for int
        //  %f for float --- insted of %f we can write %5.2f then it will show 2 digit after decimal and total 5 digits including decimal
        //  %c for char
        //  %s for string
        int a = 23;
        float w = 64.53f;
        String n = "KABIR";
        System.out.printf("My name is %s kapoor %nMy age is %d  %nmy weight is %f",n,a,w);

                // %n is used for new line

        System.out.format("%n %n %nMy name is %s kapoor %nMy age is %d  %nmy weight is %f",n,a,w);

    }
}
