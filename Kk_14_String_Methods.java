package com.company;

import java.util.Locale;

public class Kk_14_String_Methods {
    public static void main(String[] args) {
        String name = "Kabir";                      //String can be used as primitive data type,but it is not a data type
        String name1 = new String("KABIR"); //creating a new object of string just like scanner
        System.out.println("My name is :: "+name);
        System.out.println("The length of name is :: "+name.length());
        System.out.println("The name in uppercase is :: "+name.toUpperCase());
        System.out.println("The name in lowercase is :: "+name.toLowerCase());

        String n1 = "   hii How Are you   ";
        System.out.println("trimmed string is :: "+n1.trim());

        String n2 = "hii How Are you";
        System.out.println(n2.substring(2));
        System.out.println(n2.substring(2,9));

        System.out.println(n2.replace('h','o'));
        System.out.println(n2.replace("how","who"));
        System.out.println(n2.startsWith("hii"));
        System.out.println(n2.endsWith("ou"));

        System.out.println(n2.charAt(4));
        System.out.println(n2.indexOf("h",5));

        System.out.println(n2.lastIndexOf("are",5));
        System.out.println(n2.lastIndexOf("hii"));

        System.out.println(n2.equals("hii how are you"));
        System.out.println(n2.equals("hii How Are you"));
        System.out.println(n2.equalsIgnoreCase("hii how are you"));

        System.out.println("i am escape sequence \" double quotes");




    }
}
