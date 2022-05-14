package com.company;

public class kk_34_recursion {
    static int factorial(int n){
        // factorial(0) = 1
        // factorial(n) = n * n-1 *....1
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        // factorial(n) = n * factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is :: "+factorial(5));

    }

}
