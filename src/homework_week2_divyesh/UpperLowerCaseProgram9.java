package homework_week2_divyesh;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class UpperLowerCaseProgram9 {
    public static void main(String args[]) {
        Upper();
    }
    public static void Upper(){
        Scanner A =new Scanner(System.in);
        String A1 = new String("UPPERCASE CONVERTED TO LOWERCASE");
        String c = A.nextLine();
        c = c.toLowerCase();
        System.out.println(c);

    }

}
