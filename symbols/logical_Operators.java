public class logical_Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        if (a >= b && a > c) {
            System.out.println("a is greater than both b and c.");
        }

        if (a == b || !(a == c)) {
            System.out.println("a is equal to b or not equal to c.");
        }

        // NOT operator (!)
        boolean isNegative = false;
        int num = -5;
        if (num < 0) {
            isNegative = true;
        }
        System.out.println("Is the number negative? " + isNegative);

        int x = 15;
        if ((x > a && x <= c) || x == b) {
            System.out.println("x is within the range of a to c or equal to b.");
        }

        int y = 0;
        if (y != 0 && x / y > 5) {
            System.out.println("This will not be printed due to short-circuiting.");
        } else {
            System.out.println("Short-circuiting: Division by zero avoided.");
        }
    }
}
