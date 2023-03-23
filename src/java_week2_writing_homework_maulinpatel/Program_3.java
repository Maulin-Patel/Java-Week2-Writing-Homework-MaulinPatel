package java_week2_writing_homework_maulinpatel;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program_3 {
    // 3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

// 3.2 Declare one instance method.
// 3.3 Declare one static method.

    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Program_3.surname);
    }

// 3.3 Declare one static method.
// 3.4 Call both instance and static variables into both instance and static methods inside the print statement.

    public static void staticMethod() {
        Program_3 obj = new Program_3();
        System.out.println(obj.name);
        System.out.println(surname);
    }

    // 3.5 Declare the Main method.
// 3.6 Call both instance and static methods into the Main method and run the program.
    public static void main(String[] args) {
        Program_3 obj1 = new Program_3();
        obj1.instanceMethod();
        staticMethod();
    }
}

