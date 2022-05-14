package com.company;

public class kk_24_Break_Continue {
    public static void main(String[] args) {
//        break  using Loops
        for (int i=0 ; i<10;i++){
            System.out.println("Entered in for loop"+" value of i is :: "+i);
            if (i==5){
                System.out.println("The value of i is 5 so ending loop");
                break;  //loop will  exit here after break statement
            }
            }
        System.out.println("Loops ends here \n \n \n \n\n");

//        Continue using Loops
        for (int i=0 ; i<10;i++){
            if (i==5){
                System.out.println("The value of i is 5 so after statement will not be executed in loop");
                continue;// below statement will not to be executed written after continue
                         // and value of i will be increased as i++
                         // or control will go to next iteration
            }
            System.out.println("Entered in for loop"+" value of i is :: "+i);
        }
        System.out.println("Loops ends here\n \n \n \n\n");


    }


}
