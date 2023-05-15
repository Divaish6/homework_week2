package homework_week2_divyesh;

/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstanceStaticProgram4 {
    int a = 70;
    String carName = "Lexus";
    static int b =80;
    static int number = 300;

    public static void main(String[] args) {
        InstanceStaticProgram4 obj = new InstanceStaticProgram4();
        System.out.println(obj.a);
        System.out.println(obj.carName);
        System.out.println(InstanceStaticProgram4.b);
        System.out.println(InstanceStaticProgram4.number);
        /* obj.m1();// direct run
         * m2();// direct run
         */
    }
    public void m1() {
        InstanceStaticProgram4 D = new InstanceStaticProgram4();
        System.out.println(D.a);
        System.out.println(D.carName);
    }
        public static void m2(){
        System.out.println(InstanceStaticProgram4.b);
        System.out.println(InstanceStaticProgram4.number);
    }
}
