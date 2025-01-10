package Assignment_arrays;

import java.util.Scanner;

public class task13 {
    public static int[][] array = new int[3][3];  // Declare a 3x3 array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter 9 numbers for the 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int max = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("The maximum element is: " + max);

    }
}
