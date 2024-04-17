import java.util.Scanner;

public class java_static {
    public int B;
    public int H;
    public int flag = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        scanner.close();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } else {
                int area = B * H;
                System.out.println(area);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
