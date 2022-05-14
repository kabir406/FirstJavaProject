package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){        //constructors bcz class name = method name
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){     //constructors can also become overloaded method
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class kk_42_constructors {
    public static void main(String[] args) {
        //MyMainEmployee harry = new MyMainEmployee("Alok kumar", 12);
        MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("Aryan Singh");
        //harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
