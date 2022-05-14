package com.company;
class phone{
    public void showTime(){
        System.out.println("Time is 8 am ");
    }
    public void on(){
        System.out.println("Turning on phone..");
    }

}
class smartphone extends phone{
    public void music(){
        System.out.println("Playing music....");
    }
    public void on(){
        System.out.println("Turning on Smartphone....");
    }
}

public class kk_dynamic_method_dispatch {
    public static void main(String[] args) {

//        phone obj = new phone();                  //common way of creating object
//        obj.name();

//        smartphone obj = new smartphone();        //common way of creating object
//        obj.name();

        phone obj = new smartphone(); // Yes it is allowed  bcz phone is super class
        // here only methods of super class and override class in subclass will be called
        // note:: all methods of subclass cannot be called with this object

        // SmartPhone obj2 = new Phone(); // Not allowed bcz smartphone is subclass and phone is super class

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed bcz it is method of subclass


    }
}
