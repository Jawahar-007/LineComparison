import com.bridgelabz.linecomparison.Line;
import com.bridgelabz.linecomparison.Point;

public class Linecomparision {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(3, 6);
        Point p4 = new Point(6, 7);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        int result = l1.compareTo(l2); // compareTo method declaration
        if (result == 0)   // Results printing
            System.out.println("Lengths are equal :");
        else if (result > 0)
            System.out.println("\nGreater Lenght Line 1 :");
        else
            System.out.println("\n Greater Length Line 2:");

        boolean equalcheck = l1.equals(l2);
        if(!equalcheck)
            System.out.println("Both Lines are equal in length");
        else
            System.out.println("Bth Lines are not equal in length");

    }
}