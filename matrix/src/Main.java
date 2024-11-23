import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random randomNumber = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = randomNumber.nextInt(10);
            }
        }

        printMatrix(matrix);

        printMatrixDiagonal(matrix);

        printUpperMatrix(matrix);

        printLowerMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("Formatted Matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrixDiagonal(int[][] matrix) {
        System.out.println("\nDiagonal Matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printUpperMatrix(int[][] matrix) {
        System.out.println("\nUpper Matrix:");
        int count = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (j >= count) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            count += 1;
            System.out.println();
        }
    }

    public static void printLowerMatrix(int[][] matrix) {
        int count = 0;
        System.out.println("\nLower Matrix:");
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= count) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            count += 1;
            System.out.println();
        }
    }
}
