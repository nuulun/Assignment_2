package Assignment_arrays;

public class task4 {
    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[firstArray.length +secondArray.length];

    public static void main(String[] args) {

        for (int i = 0; i < firstArray.length; i++){
            resultArray[i] = firstArray[i];
        }
        for (int i = firstArray.length; i < firstArray.length + secondArray.length; i++) {
            resultArray[i] = secondArray[i-firstArray.length];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
