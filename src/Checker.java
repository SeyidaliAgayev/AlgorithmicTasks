import java.util.Scanner;

public class Checker {
    public static String usernameChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username!");
        String username = scanner.nextLine();
        User user = new User("Ali","123");
        if (username.equals(user.getUsername())){
            System.out.println("Username is correct!");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the password!");
            String password = scanner.nextLine();
            if (password.equals(user.getPassword())) {
                System.out.println("Password is correct!");
            } else {
                System.out.println("Invalid password!");
            }
        }
        System.exit(-1);
        return "Welcome!";
    }
}
