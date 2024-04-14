import java.util.Scanner;            //Scanner class is part of the java.util package
                                     //Scanner for handling input from various sources
public class input {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        //? java.util.Scanner scanner = new Scanner(System.in);   
        //! can do this if we don't want to use import

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer

        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble(); // Read a double

        // Display the inputs
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("The decimal number you entered is: " + decimal);

        // Close the scanner to free up resources
        scanner.close();
    }
}   