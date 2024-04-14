public class Ternary_Operators {
    public static void main(String[] args) {
        int number = 10;
        String result;

        // Using ternary operator to determine if the number is even or odd
        result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result);

        // Another example with a different condition
        int age = 25;
        String message = (age >= 18) ? "You are an adult" : "You are underage";

        System.out.println(message);
    }
}
