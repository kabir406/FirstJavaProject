package com.company;

class firstClass{
    int a;
    public int getA() {
        return a;
    }
    firstClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class SecondClass extends firstClass{
    SecondClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class kk_47_this_super {
    public static void main(String[] args) {
        firstClass e = new firstClass(65);
        SecondClass d = new SecondClass(5);
        System.out.println(e.getA());

    }
}
