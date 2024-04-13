public class Operations {
    public static void main(String[] args) {
        double x = 5 / 2; // This division will result in integer division (truncation of decimal part)
        System.out.println("5/2 = " + x); // Output: 5/2 = 2.0 (not 2.5)

        x = 5.0 / 2; // This division involves at least one double value, so it will result in floating-point division
        System.out.println("5/2 = " + x); // Output: 5/2 = 2.5

        x = (double) 5 / 2; // Explicitly casting one operand to double for floating-point division
        System.out.println("5/2 = " + x); // Output: 5/2 = 2.5

        int y = 5 + 2; // Addition
        System.out.println("5+2 = " + y); // Output: 5+2 = 7

        y = 5 - 2; // Subtraction
        System.out.println("5-2 = " + y); // Output: 5-2 = 3

        y = 5 * 2; // Multiplication
        System.out.println("5*2 = " + y); // Output: 5*2 = 10

        y = 5 % 2; // Modulo (remainder of division)
        System.out.println("5 mod 2 = " + y); // Output: 5 mod 2 = 1
        y=3;
        y++;
        System.out.println("y++ =" + y);

        y--;
        System.out.println("y-- =" + y);
    }
}
