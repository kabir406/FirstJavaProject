package com.company;

class employee1{
    int sn;
    String name;
    int age;
    String schoolName= "SSGJ";
    int salary;
    public void printDetails(){
        System.out.println("My school no :: "+ sn + " Name :: "+name + " Age :: "+age);
    }

    public int getSalary(){
        return salary;
    }
}

public class kk_38_custom_class {
    public static void main(String[] args) {
        employee1 yash=new employee1();
        yash.sn=807;
        yash.name="Yash Raj";
        yash.age=27;
        yash.printDetails();    //below line can also be used instead of this method
        // System.out.println("My school no :: "+ yash.sn+ " Name :: "+yash.name + " Age :: "+yash.age);

        employee1 anmol = new employee1();
        anmol.sn=808;
        anmol.name = "Anmol Gupta";
        anmol.age = 25;
        anmol.salary=25000000;
        anmol.printDetails();

        System.out.println("salary of "+anmol.name + " is "+anmol.getSalary());


    }
}
