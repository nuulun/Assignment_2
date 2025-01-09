package Assignment_arrays;

public class task3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) {
        for (int i = 0; i< 3; i++) {
            array[2*i ] *= -1;
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}
