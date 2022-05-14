package com.company;

public class kk_33_varArgs {
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a , int b , int c){
        return a+b+c;
    }
    static int sum(int a , int b ,int c , int d){
        return a+b+c+d;
    }

    static int sumUsingVarargs(int ...arr){         //  varargs is used here we can give multiple arguments
        int result=0;
        for (int a :arr ) {
            result+=a;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("the sum of 14 and 45 is :: "+ sum(14,45));
        System.out.println("the sum of 14 ,25 and 45 is :: "+ sum(14,25,45));
        System.out.println("the sum of 14 , 25 , 85 and 45 is :: "+ sum(14,25,85,45));

        //  here we can ony give defined no of arguments,
        //  so we require VARARGS to give multiple arguments represented by int ...array

        // sum using varargs
        System.out.println("sum using varargs");
        System.out.println("the sum of 14 and 45 is :: "+ sumUsingVarargs(14,45));
        System.out.println("the sum of 14 ,25 and 45 is :: "+ sumUsingVarargs(14,25,45));
        System.out.println("the sum of 14 , 25 , 85 and 45 is :: "+ sumUsingVarargs(14,25,85,45));


    }
}
