package Assignment_arrays;

import java.util.Scanner;

public class java16 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the pyramid: ");
        int height = sc.nextInt();

        array = new char[height][2 * height - 1];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                array[i][j] = ' ';
            }
            int start = height - i - 1;
            int end = height + i - 1;
            for (int j = start; j <= end; j++) {
                array[i][j] = '#';
            }
        }

        System.out.println("Pyramid:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
