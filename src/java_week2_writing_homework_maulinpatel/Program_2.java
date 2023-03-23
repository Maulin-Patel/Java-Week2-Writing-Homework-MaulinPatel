package java_week2_writing_homework_maulinpatel;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the program.
 */
public class Program_2 {
    // 2.1 Declare two static variables
    static int a = 100;
    static int b = 200;

// 2.2 Declare one static method
// 2.3 Call both static variables into the static method inside the print statement.

    public static void staticMethod() {
        System.out.println(a);
        System.out.println(b);
    }

// 2.4 Declare the Main method.
// 2.5 Call the static method into the Main method and Run the program.

    public static void main(String[] args) {
        staticMethod();
    }
}
