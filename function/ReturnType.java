package function;
public class ReturnType{
    // Method to return an int value
    public int returnInt() {
        return 10;
    }

    // Method to return a double value
    public double returnDouble() {
        return 3.14;
    }

    // Method to return a String value
    public String returnString() {
        return "Hello, World!";
    }

    // Method to return an array of integers
    public int[] returnIntArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        return numbers;
    }

    public static void main(String[] args) {
        ReturnType example = new ReturnType();

        // Calling methods to get different types of return values
        int intValue = example.returnInt();
        double doubleValue = example.returnDouble();
        String stringValue = example.returnString();
        int[] intArrayValue = example.returnIntArray();

        // Printing the return values
        System.out.println("Returned int value: " + intValue);
        System.out.println("Returned double value: " + doubleValue);
        System.out.println("Returned String value: " + stringValue);
        System.out.print("Returned int array value: ");
        for (int num : intArrayValue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

