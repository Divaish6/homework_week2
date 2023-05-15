package homework_week2_divyesh;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class RadiusValueProgram6 {
    public static void main(String[] args) {
        Radius();
    }
    public static void Radius(){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter any radius value:");
        double r = a.nextDouble();
        double Area =(22*r*r)/7;
        System.out.println("Area of circle of:"+Area);
    }
}
