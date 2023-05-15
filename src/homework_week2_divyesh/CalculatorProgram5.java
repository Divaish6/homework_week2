package homework_week2_divyesh;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class CalculatorProgram5 {
    public static void main(String[] args) {
        CalculatorProgram5 DT = new CalculatorProgram5();
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("first number ");
        a = sc.nextInt();
        System.out.println("second number");
        b = sc.nextInt();

        //Calling Static Methods
        addition(a, b);
        subtraction(a, b);

        //Calling Instance Methods
        DT.multiplication(a, b);
        DT.division(a, b);
    }

         //Static Method
        public static void addition ( int a, int b){
            System.out.println("addition of a+ b (" + a + " + " + b + ") = " + (a + b));
        }
        public static void subtraction ( int a, int b){
            System.out.println("Subtraction of a- b (" + a + " - " + b + ") = " + (a - b));
        }
        // Instance Method
       public void multiplication ( int a, int b){
            System.out.println("multiplication of a * b (" + a + " * " + b + ") = " + (a * b));
        }
        public void division ( int a, int b){
            System.out.println("Division of a / b (" + a + " / " + b + ") = " + (a / b));
        }

    }



