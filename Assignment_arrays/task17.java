package Assignment_arrays;

public class task17 {

        public static char[][] chars = {
                {'a', 'b', 'c', 'd', 'e', 'f'},
                {'j', 'h', 'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p', 'q', 'r'},
                {'s', 't', 'u', 'v', 'w', 'x'}
        };

        public static void main(String[] args) {
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    System.out.print(chars[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 1; i < chars.length - 1; i++) {
                for (int j = 1; j < chars[i].length - 1; j++) {
                    chars[i][j] = '-';
                }
            }

            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    System.out.print(chars[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }

