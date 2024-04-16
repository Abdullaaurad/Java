// Main.java
public class main {
    public static void main(String[] args) {
        Person person1 = new Teacher("John Doe", "Math");
        Person person2 = new Student("Jane Smith", 12345);

        // Polymorphic behavior
        person1.displayInfo(); // Calls Teacher's displayInfo method
        person2.displayInfo(); // Calls Student's displayInfo method
    }
}
