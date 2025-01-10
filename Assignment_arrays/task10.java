package Assignment_arrays;

import java.util.Scanner;

public class task10 {
    public static int[][] multiArray;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = sc.nextInt();

        int[] columnSizes = new int[N];
        System.out.println("Enter the column sizes for each row:");
        for (int i = 0; i < N; i++) {
            columnSizes[i] = sc.nextInt();
        }

        multiArray = new int[N][];

        for (int i = 0; i < N; i++) {
            multiArray[i] = new int[columnSizes[i]];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[] ");
            }
            System.out.println();
        }

    }
}
