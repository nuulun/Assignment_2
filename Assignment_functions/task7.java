package Assignment_functions;

public class task7 {
    public static void main(String[] args) {
        signIn("John");
        signIn("user");
    }

    public static void signIn(String username) {
        if ("user".equals(username)) {
            return;
        }

        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
