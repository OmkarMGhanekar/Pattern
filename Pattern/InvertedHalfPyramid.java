public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
