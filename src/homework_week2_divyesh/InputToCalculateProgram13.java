package homework_week2_divyesh;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class InputToCalculateProgram13 {
    public static void main(String[] args) {
        Input();

    }
    public static void Input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.print("Input the third number: ");
        int c = in.nextInt();
        System.out.print("The average value is " + average(a, b, c) + "\n");
    }
        public static int average ( int a, int b, int c){
            return (a + b + c) / 3;
        }
    }

