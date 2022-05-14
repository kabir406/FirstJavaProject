package com.company;

class circle{
    float radius;
    public circle(float r){
        this.radius = r;
    }
    public float area(float radius){
        return (float) (Math.PI*radius*radius);
    }
    public float perimeter(float radius){
        return (float) (2*Math.PI*radius);
    }
}

class cylinder extends circle{
    float height;
    public cylinder(float r, float h){
        super(r);
        this.height = h;
    }
    public float surfaceArea(float radius , float height){
        return (float) (this.perimeter(radius)*height);
    }
    public float volume(float radius , float height) {
        return (float) (this.area(radius)* height);
    }
}


public class kk_52_ch10_ps {
    public static void main(String[] args) {
        // 1 Create a class circle and use inheritance to create another class cylinder from it
        cylinder cyl = new cylinder(7,10);

        //2 Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
        //3 Create a method for area and volume in 1
        //4 create methods for area & volume in 2 also create getters and setters
        //5 What is the order of constructor execution for the following inheritance hierarchy
        //                    Base
        //                   Derived 1
        //                   Derived 2
        //      Derived obj = new Derived 2( );
        //      Which constructor(s) will be executed & in what order?


    }
}
