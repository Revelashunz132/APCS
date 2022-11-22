//John Aston Adams
//11/22/22

package HomeworkUnit2;

import java.util.Scanner;
import java.lang.Math;

public class DistToLine {
    static double A, B, C;
    
    static double getDist(double a, double b){
        return (Math.abs((A * a) + (B * b) + C)/ Math.sqrt((A * A) + (B * B)));
    }
    public static void main(String[] args){
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter the A value for the line: ");
        A = kbReader.nextDouble();
        System.out.print("Enter the B value for the line: ");
        B = kbReader.nextDouble();
        System.out.print("Enter the C value for the line: ");
        C = kbReader.nextDouble();
        System.out.print("Enter the x coordinate of the point: ");
        double x = kbReader.nextDouble();
        System.out.print("Enter the y coordinate of the point: ");
        double y = kbReader.nextDouble();
        System.out.println("\nDistance from the point to the line is: " + getDist(x,y));
        kbReader.close();
    }
}
