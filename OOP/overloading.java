
public class overloading {
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String str1,char c){
        return str1+" "+c;
    }

    // Method to concatenate two strings
    public String add(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static void main(String[] args) {
        overloading example = new overloading();

        // Using the first add method
        int sum1 = example.add(5, 3);
        System.out.println("Sum of two integers: " + sum1); // Output: Sum of two integers: 8

        // Using the second add method
        int sum2 = example.add(5, 3, 2);
        System.out.println("Sum of three integers: " + sum2); // Output: Sum of three integers: 10

        String result = example.add("Hello",'a');
        System.out.println("Concatenated string and a char: " + result);

        // Using the concatenate method
        String resultk = example.add("Hello", "World");
        System.out.println("Concatenated string: " + resultk); // Output: Concatenated string: Hello World
    }
}
