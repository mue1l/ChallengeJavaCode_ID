package day02JavaChallenge_SamuelSibuea;

public class day02Java_Samuel {
    public static void main(String[] args) {

        // No.1 OrderEvenBeforeOd
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        OrderEvenBeforeOdd(arr);
//        DisplayArray(arr);

        // No.2 String Palindrom
//        String[] input = {"donout", "king", "donout"};
//        System.out.println(IsPalindrome(input));

        // No.3 AddOnePlus
//        int[] inputAddOnePluss = {1, 3, 2, 4};
//        int[] result = AddOnePlus(inputAddOnePluss);
//        DisplayArray(result);  // Output: [1, 3, 2, 5]

        // Soal Matrix 1
//        displayMatrix(matrixDiagonal1(5,5));

        // Soal Matrix 2
//        displayMatrix(matrixDiagonal2(5,5));

        // Soal Matrix 3
//        displayMatrix(matrixDiagonal3(7));

        // Soal Matrix 4
//        displayMatrix(matrixDiagonal4(8));
    }


    public static int[] OrderEvenBeforeOdd(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (shouldSwap(arr[j], arr[j + 1])) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    private static boolean shouldSwap(int a, int b) {

        if (a % 2 != 0 && b % 2 == 0) return true;
        if (a % 2 == 0 && b % 2 != 0) return false;

        return a > b;
    }

    public static void DisplayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static boolean IsPalindrome(String[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!arr[left].equals(arr[right])) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static int[] AddOnePlus(int[] arr) {
        if (arr.length == 0) return arr;

        arr[arr.length - 1] += 1;
        return arr;
    }

    public static void DisplayArrayAddOnePlus(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[][] matrixDiagonal1(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    matrix[row][col] = row + 1;
                } else if (row > col) {
                    matrix[row][col] = 20;
                } else {
                    matrix[row][col] = 10;
                }
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] matrixDiagonal2(int n, int m){
        int[][] matrix = new int[n][m];
        int counter = n;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col){
                    matrix[row][col] = counter;
                    counter--;
                } else if (row > col) {
                    matrix[row][col] = 10;
                } else {
                    matrix[row][col] = 20;
                }

            }
        }
        return matrix;
    }

    public static int[][] matrixDiagonal3(int n){
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == 0){
                    matrix[row][col] = col;
                    //counter++;
                } else if (col == 0) {
                    matrix[row][col] = row;
                } else if (row == matrix.length-1){
                    matrix[row][col] = row+col;
                } else if (col == matrix.length-1){
                    matrix[row][col] = row+col;
                }

            }
        }
        return matrix;
    }

    public static int[][] matrixDiagonal4(int n){
        int[][] matrix = new int[n][n];
        //int sum = 0;
        for (int row = 0; row < matrix.length-1; row++) {

            for (int col = 0; col < matrix[row].length-1; col++) {
                matrix[row][col] = row + col;
                matrix[row][n-1] += matrix[row][col];;
                matrix[n-1][col] += matrix[row][col];;
            }
        }
        for (int i = 0; i < n-1; i++) {
            matrix[n-1][n-1] += matrix[n-1][i];;

        }
        return matrix;
    }
}
