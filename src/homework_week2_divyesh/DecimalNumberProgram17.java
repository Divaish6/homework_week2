package homework_week2_divyesh;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

public class DecimalNumberProgram17 {
    public static void main(String[] args) {
       Decimal();

    }
    public static void Decimal(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input decimal number :  " );
        int a = sc.nextInt();
        System.out.println(" Binary number is : " + Integer.toBinaryString (a));
    }

}
