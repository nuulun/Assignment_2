package Assignment_arrays;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N > 0) {
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = nums.length - 1; i >= 0; i--) {
                    System.out.println(nums[i]);
                }
            } else {
                for (int num : nums) {
                    System.out.println(num);
                }
            }
        }
    }
}
