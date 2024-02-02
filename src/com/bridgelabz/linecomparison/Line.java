package com.bridgelabz.linecomparison;

public class Line implements Comparable<Line> {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calclenght() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }


    @Override
    public int compareTo(Line l2) {

        Double len1 = this.calclenght();
        Double len2 = l2.calclenght();
        return len1.compareTo(len2);
    }

    public boolean equals(Line l2) {
        return this == l2;
    }
}