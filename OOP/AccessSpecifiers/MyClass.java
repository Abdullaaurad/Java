public class MyClass {
    public int publicVariable;
    private int privateVariable;
    protected int protectedVariable;

    // Default access specifier (package-private)
    int defaultVariable;

    // Constructor
    public MyClass() {
        publicVariable = 1;
        privateVariable = 2;
        protectedVariable = 3;
        defaultVariable = 4;
    }

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    // Default (package-private) method
    void defaultMethod() {
        System.out.println("This is a default method");
    }
}