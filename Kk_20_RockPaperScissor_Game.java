package com.company;
import java.util.Random;
import java.util.Scanner;

public class Kk_20_RockPaperScissor_Game {
    public static void main(String[] args) {
        /*
        Scanner ke = new Scanner(System.in);
        System.out.print("Please select from following option \n ROCK PAPER SCISSOR \nType your selection here :: ");
        String sd = ke.next();
        String userOption = sd.toUpperCase();

        double a = Math.random() * 10;
        double b = a % 3;
        int sdf =(int) Math.round(b);
        String  systemGenerated= null;
        if (sdf==0){
            systemGenerated = "ROCK";
            System.out.println("System Generated option is :: "+ systemGenerated);
        }
        else if (sdf==1){
            systemGenerated = "PAPER";
            System.out.println("System Generated option is :: "+ systemGenerated);
        }
        else if (sdf==2){
            systemGenerated = "SCISSOR";
            System.out.println("System Generated option is :: "+ systemGenerated);
        }


       else if (systemGenerated == userOption){
            System.out.println(" Match draw !! \n Retry Again...");
       }
       else{
            if (userOption == "ROCK"){
                System.out.println("it is rock ");
            }
            else if (userOption == "PAPER"){
                System.out.println("it is paper ");
            }
            else if (userOption =="SCISSOR"){
                System.out.println("it is scissor");
            }

        }
        System.out.println("The Game is over .......");


//          there is issue in the last part of the program here we are comparing systemgenerated to user input
//          but we are unable to write the proper logic for the program


         */

        //correct copied code below
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2) {
            System.out.println("Computer choice: Scissors");
        }

    }
}
