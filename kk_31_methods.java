package com.company;

public class kk_31_methods {
    int mul(int x , int y){     //method 1 which is not static
        return x*y;
    }
    static int sum(int x ,int y){       //method 2 which is static
        return x+y;
    }
    public static void main(String[] args) {
        int a=45;
        int b=25;
        int c=sum(a,b); //method 2 can be called directly bcz it is static but method 1 cannot be
        System.out.println("the sum of  "+a+" and "+b+" is  "+c);

        // method invocation using object creation
        kk_31_methods sd=new kk_31_methods(); // creating new object of this class
        int d=sd.mul(a,b);      //method 1 cannot be called directly bcz it is not static
                                //it will called by using object of this class
        System.out.println("the multiplication of  "+a+" and "+b+" is  "+d);



    }
}
