package homework_week2_divyesh;

/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class StaticProgram2 {
    static  int d = 10;

    static int number = 20;

    public static void main(String[] args) {
        System.out.println(StaticProgram2.d);
        System.out.println(StaticProgram2.number);
       /* m6();//direct run*/

    }
    public  static void m6() {
        System.out.println(StaticProgram2.d);
        System.out.println(StaticProgram2.number);
    }
}
