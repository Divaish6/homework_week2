package homework_week2_divyesh;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

public class SwapVariableProgram15 {
    public static void main(String[] args) {
       Swap();
    }
    public static void Swap(){
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        a = in.nextInt();
        System.out.println("Input the second number: ");
        b = in.nextInt();
        System.out.println(" Swapped values :" + a + " and " + b);
    }
}
