public class Static_ {
    // Static variable
    public static int staticVar = 10;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        // Accessing static variable and method without creating an object
        System.out.println("Static variable value: " + Static_.staticVar);
        Static_.staticMethod();

        // Modifying static variable
        Static_.staticVar = 20;
        System.out.println("Updated static variable value: " + Static_.staticVar);
    }
}
