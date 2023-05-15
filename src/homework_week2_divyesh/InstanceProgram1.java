package homework_week2_divyesh;
/**
 *  1.1 Declare two instance variables.
 *  1.2 Declare one instance method.
 *  1.3 Call both instance variables into the instance method inside the print statement.
 *  1.4 Declare the Main method.
 *  1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceProgram1 {
    int d = 20;
    String name = "Java";

    public static void main(String[] args) {
        InstanceProgram1 obj = new InstanceProgram1();
        System.out.println(obj.d);
        System.out.println(obj.name);
        /*obj.m1();//direct run*/
    }

    public void m1() {
        InstanceProgram1 a = new InstanceProgram1();
        System.out.println(a.d);
        System.out.println(a.name);
    }

}
