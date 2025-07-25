package Pattern;

public class Main {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <=n; row++) {
//            for (int col = row; col <=n; col++) {
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){

        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
               System.out.print(col);
            }
            System.out.println();
        }

    }
    static void pattern5(int n){

        for (int row = 0; row <n*2; row++) {
            int totalColInRow = row > n ? 2*n-row : row;
            for (int col = 0; col <totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){

        for (int row = 0; row <n*2; row++) {
            int totalColInRow = row > n ? 2*n-row : row;
            int noOfSpace=n-totalColInRow;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

