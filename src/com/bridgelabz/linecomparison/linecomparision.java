package com.bridgelabz.linecomparison;

public class linecomparision {
    public static void main(String args[]){
        Point p1 = new Point(1,5);
        Point p2 = new Point(4,5);
        Point p3 = new Point(3,6);
        Point p4 = new Point(6,7);
        line l1 = new line(p1,p2);
        line l2 = new line(p3,p4);

        double len1 = l1.calclenght();
        double len2 = l2.calclenght();

        System.out.println(" Length of Line 1 : "+len1);
        System.out.println(" Length of Line 2 : "+len2);
    }
}
