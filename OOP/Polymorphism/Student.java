// Student.java
public class Student extends Person {
    private int rollNumber;

    public Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Students Roll Number: " + rollNumber);
    }
}
