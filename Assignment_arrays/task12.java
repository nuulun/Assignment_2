package Assignment_arrays;

public class task12 {
    public static int[][] array = new int[2][3];

    public static void main(String[] args) {
        // Fill the array with integers (not equal to 0)
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        // Print each element of the array on a new line
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
