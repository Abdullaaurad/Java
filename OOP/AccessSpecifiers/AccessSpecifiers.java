public class AccessSpecifiers {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Accessing public members
        myObject.publicVariable = 10;
        myObject.publicMethod();

        // Accessing default members (within the same package)
        myObject.defaultVariable = 20;
        myObject.defaultMethod();

        // Private and protected members cannot be accessed directly from outside the class
        // myObject.privateVariable = 30;  // This line will cause a compilation error
        // myObject.privateMethod();       // This line will cause a compilation error
        // myObject.protectedVariable = 40; // This line will cause a compilation error
        // myObject.protectedMethod();      // This line will cause a compilation error
    }
}