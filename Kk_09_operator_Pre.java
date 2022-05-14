package com.company;

public class Kk_09_operator_Pre {
    public static void main(String[] args) {
        // operators precedence & associativity
        //in java Operator precedence work as
        //PEMDAS
        //
        //P - Parenthesis
        //E - Exponential
        //M - Multiplication
        //D - Division
        //A - Addition
        //S - Subtraction
        //
        //When two operator of same precedance are encountered(like [* /], [+ -]) it evaluates from left to right.


        //quick quiz
        int a = 10;
        int b = 16;
        int c = 20;
        int k = a*b-c/a;     //multiplication & division are of same precedence so it will operate from left to right
            //=10*16-20/10
            //=160-2
            //=158
        System.out.println("k = a*b-c/a   value of k is :: "+k);


        int j = c/a-a*b;
            // j=20/10-10*16
            // j=2-10*16
            // j=2-160
            // j=-158
        System.out.println("j = c/a-a*b  value of j is :: "+j);

        int l = a*c/2;
            //=10*20/2
            //=200/2
            //=100
        System.out.println("l = a*c/2 the value of l is :: "+l);

        int h = b*b-4*a*c/2*a;               //h=-3744
        int hh= ((b*b)-(4*a*c))/(2*a);         //hh=-27
        System.out.println("value of h is :: "+h);
        System.out.println("Value of hh is :: "+hh);



    }

}
