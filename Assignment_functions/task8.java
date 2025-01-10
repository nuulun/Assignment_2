package Assignment_functions;

public class task8 {
    public static void main(String[] args) {
        long number = 5;
        long result = cube(number);
        System.out.println("The cube of " + number + " is: " + result);
    }

    public static long cube(long number) {
        return number * number * number;
    }
}
