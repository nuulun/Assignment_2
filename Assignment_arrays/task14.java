package Assignment_arrays;

import java.util.Scanner;

public class task14 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers for the 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += array[i][j];
            }
            if (rowSum < minSum) {
                minSum = rowSum;
            }
        }

        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += array[i][j];
            }
            if (colSum < minSum) {
                minSum = colSum;
            }
        }

        System.out.println("The minimum sum is: " + minSum);

    }
}
