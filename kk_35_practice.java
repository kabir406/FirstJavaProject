package com.company;

public class kk_35_practice {
    static void mulTable(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.print(n*i+" ");
        }
        System.out.println();
    }
    static void printPattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumNatural(int n){
        // Base Condition -- it is required to break the recursion
        if (n==1){
            return 1;
        }
        else {
            return n+sumNatural(n-1);
        }
    }

    static void revPattern(int n){
        for (int i = n; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    static int fibSeries(int n){
        // fibonacci  series is :: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else   {
            return fibSeries(n-2)+fibSeries(n-1);
        }
    }

    static float argAvg(float ...arr){
        float sum=0;
        for (float a:arr) {
            sum+=a;
        }
        return sum/arr.length;

    }

    static void revPatternRecursion(int n){
        if (n>0){
            revPatternRecursion(n-1);
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternRec(int n){
        int b=0;
        if (b<n){
            patternRec(b+1);
            for (int j = 0; j <n; j++) {
                System.out.print("*");
                b++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 1 Write a Java method to print the multiplication table of a number n.
        //mulTable(5);


        // 2 Write a program using functions to print the following pattern:
        //  *
        //  **
        //  ***
        //  ****
        //printPattern(4);


        // 3 Write a recursive function to calculate the sum of first n natural numbers.
        //System.out.println("sum of first 10 natural number is :: "+sumNatural(10));


        // 4 Write a function to print the following pattern:---not able to do it using recursion
        //    ****
        //    ***
        //    **
        //    *
        //revPattern(4);


        // 5 Write a function to print the nth term of the Fibonacci series using recursion.
        // fibonacci  series is :: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144....
        //System.out.println("the 13th term of fibonacci  series is ::"+fibSeries(13));


        // 6 Write a function to find the average of a set of numbers passed as arguments.
        //System.out.println("Average of the given numbers are :: "+argAvg(1,2,3,4,5,6,7,8,9,10));


        // 7 Repeat problem 4 using Recursion.
        //revPatternRecursion(5);

    }
}