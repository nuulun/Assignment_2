package Assignment_arrays;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (strings[i] != null && strings[i].equals(strings[j])) {
                    strings[j] = null;
                }
            }
        }

        for (String str : strings) {
            System.out.print(str + " ");
        }

    }
}
