package homework_week2_divyesh;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class InstanceStaticProgram3 {
    String name = "Macbook";
    static int number = 200;

    public static void main(String[] args) {
        InstanceStaticProgram3 obj = new InstanceStaticProgram3();
        System.out.println(obj.name);
        System.out.println(InstanceStaticProgram3.number);
        /*obj.m1();//direct run
        /*m2();//direct run*/
    }
    public void m1() {
        InstanceStaticProgram3 a = new InstanceStaticProgram3();
        System.out.println(a.name);
    }

        public static void m2(){
        System.out.println(InstanceStaticProgram3.number);

    }

    }
