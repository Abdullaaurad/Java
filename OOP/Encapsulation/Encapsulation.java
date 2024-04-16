public class Encapsulation{
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person1 = new Person("John Doe", 30, "123 Main St");

        // Using getter methods to access private variables
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());

        // Using setter methods to modify private variables
        person1.setName("Jane Doe");
        person1.setAge(25);
        person1.setAddress("456 Park Ave");

        // Printing updated information
        System.out.println("\nUpdated Info:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
    }
}
