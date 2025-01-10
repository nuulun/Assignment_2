package Assignment_functions;

public class task6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod(10);
        universalMethod(3.14);
        universalMethod("Hello, World!");
        universalMethod(new int[]{1, 2, 3});
        universalMethod(5, 10);
        universalMethod(new String[]{"Java", "Python", "C++"});
        universalMethod(true);
        universalMethod(5.5f, 10.5f);
        universalMethod(5L, 10L);
    }

    public static void universalMethod() {
        System.out.println("This is the no-parameter version.");
    }

    public static void universalMethod(int a) {
        System.out.println("This is the integer version. Value: " + a);
    }

    public static void universalMethod(double a) {
        System.out.println("This is the double version. Value: " + a);
    }

    public static void universalMethod(String a) {
        System.out.println("This is the String version. Value: " + a);
    }
    public static void universalMethod(int[] arr) {
        System.out.print("This is the array version. Array values: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void universalMethod(int a, int b) {
        System.out.println("This is the two integer version. Sum: " + (a + b));
    }

    public static void universalMethod(String[] arr) {
        System.out.print("This is the String array version. Array values: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void universalMethod(boolean a) {
        System.out.println("This is the boolean version. Value: " + a);
    }

    public static void universalMethod(float a, float b) {
        System.out.println("This is the two float version. Product: " + (a * b));
    }

    public static void universalMethod(long a, long b) {
        System.out.println("This is the two long version. Difference: " + (a - b));
    }
}

