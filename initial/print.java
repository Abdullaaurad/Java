public class print {
    public static void main(String[] args) {
        System.out.print("Hello ");      //This method prints the specified string without appending a new line character at the end
        System.out.println("World!");     //adds a newline
        int num1 = 10;
        double num2 = 20.5;
        System.out.printf("Number 1: %d,\nNumber 2: %.2f", num1, num2);
    }
}