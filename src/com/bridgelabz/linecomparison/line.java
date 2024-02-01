package com.bridgelabz.linecomparison;

public class line{
    Point p1;
    Point p2;

    public line(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public double calclenght(){
        return Math.sqrt(Math.pow(p2.x-p1.x,2)+ Math.pow(p2.y-p1.y,2));
    }
}
