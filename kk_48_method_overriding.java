package com.company;

class A{
    public int aryan(){
        return 4;
    }
    public void meth2(){                //original method meth2()
        System.out.println("I am Method 2 of class A ");
    }
}
class B extends A{
    public void meth3(){
        System.out.println("I am Method 3 of class B ");
    }
    @Override
    public void meth2(){                //overriding method meth2()
        System.out.println("I am Method 2 of class B ");
    }
}
public class kk_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();


    }
}
