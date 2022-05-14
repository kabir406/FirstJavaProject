package com.company;

public class kk_25_practice_questions {
    public static void main(String[] args) {
//       Question 1: Write a program to print the following pattern :
//        ****
//        ***
//        **
//        *
//        int row,column=4;
        for (int row=4;row>=0;row--){
            for (int column=row; column>=0;column--){
                System.out.print("*");
            }
            System.out.println("");
        }

//        Question 2: Write a program to sum first n even numbers using a while loop.
        System.out.println("\n\tprogram to sum first n even numbers using a while loop\n");
        int a=1;
        int sum=0;
        int n=5;
        while (a<=n){
            sum=sum+(2*a);
            a++;
        }
        System.out.println("sum of first "+n+" even number is "+sum);

//        Question 3: Write a program to print the multiplication table of a given number n.
        System.out.println("\n\n \tprogram to print the multiplication table of a given number n.");
        int no=5;
        System.out.println("Table of "+no +" is as follows ::");
        for (int i=1;i<=10;i++){
            System.out.println(no*i);
        }

//        Question 4: Write a program to print a multiplication table of 10 in reverse order.
        System.out.println("\n\n\n\tprogram to print a multiplication table of 10 in reverse order.");
        int tab=10;
        System.out.println("Table of "+tab +" is as follows ::");
        for (int i=10;i>0;i--) {
            System.out.println(tab * i);
        }

//        Question 5: Write a program to find the factorial of a given number using for loops.
        System.out.println("\n\n\n\tprogram to find the factorial of a given number using for loops.");
        int c=5;
        int fact=1;
        for (int i=1;i<=c;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+c+" is ::"+fact);

//        Question 6: Repeat Question 5 using a while loop.
        System.out.println("\n\n\n\tprogram to find the factorial of a given number using While loops.");
        int i=1;
        int factW=1;
        while(i<=c){
            factW=factW*i;
            i++;
        }
        System.out.println("factorial of "+c+" is ::"+factW);


//        Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        System.out.println("\n\n\n\tProgram to calculate the sum of the numbers occurring in the multiplication table of 8.");
        int eight=8;
        int eightSum=0;
        for (int i1=1;i1<=10;i1++){
            eightSum=eightSum+(i1*eight);
        }
        System.out.println("The sum of table of "+eight+" is :: "+eightSum);
    }
}
