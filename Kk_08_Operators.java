package com.company;

public class Kk_08_Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 7 + a;  // simply b = 7+4 =11
        System.out.println(b);

        int c = 7 % a; //  % is called modulo operator it gives remainder
        System.out.println(c);

        System.out.println(5 == 4);  // == is comparison operator

        // Logical operators
        System.out.println(5 > 4 && 96 < 3);    //it is called and operator
        System.out.println(5 > 4 || 96 < 3); //it is called or operator symbol double pipe
    }
}