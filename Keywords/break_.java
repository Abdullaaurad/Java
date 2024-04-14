public class break_ {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + ", " + j);
                if (j == 2) {
                    System.out.println("Break out of the loop");
                    break; // This will break out of the inner loop when i = 2 and j = 2
                }
            }
        }
    }
}
