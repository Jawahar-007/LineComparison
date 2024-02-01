package com.bridgelabz.linecomparison;

public class linecomparison {
    public static void main(String args[]){
        Point p1 = new Point(1,5);
        Point p2 = new Point(4,5);
        Point p3 = new Point(3,6);
        Point p4 = new Point(6,7);
        line l1 = new line(p1,p2);
        line l2 = new line(p3,p4);

        double len1 = l1.calclenght();
        System.out.println(len1);
        double len2 = l2.calclenght();
        System.out.println(len2);

        if(len1 == len2)
            System.out.println("Lengths are equal :"+len1);
        else if (len1>len2)
            System.out.println("\nGreater Length :"+len1);
        else
            System.out.println("\n Greater Length :"+len2);
    }
}
