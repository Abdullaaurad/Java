public class if_else {
    public static void main(String[] args) {
        int number = 15;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Another example
        int age = 10;

        if (age < 18) {
            System.out.println("You are underage.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }
}
