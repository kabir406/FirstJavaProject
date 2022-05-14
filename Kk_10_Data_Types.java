package com.company;

import javax.sound.sampled.FloatControl;

public class Kk_10_Data_Types {
    public static void main(String[] args) {
        //Result = byte + short -> integer
        //Result = short + integer -> integer
        //Result = long + float -> float
        //Result = integer + float -> float
        //Result = character + integer -> integer
        //Result = character + short -> integer
        //Result = long + double -> double
        //Result = float + double -> double

        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);

        int i = 56;
        System.out.println(i++);        //i=56 first printed or used then incremented or increased by 1
        System.out.println(i);          //i= 57
        System.out.println(++i);        //i = 58 first increment then printed or used
        System.out.println(i);          //i = 58


        int gh = 45;
        int sr = 35;
        int ss = gh++;           //ss = 45 then value of gh increments and becomes 46
        int pp = ++sr;           //pp = 36 bcz first value of sr incremented then used
        System.out.println("ss :: "+ss);
        System.out.println("pp :: "+pp);




    }
}
