package class12;

public class Task1 {
    public static void main(String[] args) {
        String username = "admin33";
        String password = "C432";
        String enteredPassword = "C432";
        if (username.isEmpty() && password.isEmpty()) {
            System.out.println("Username and password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(enteredPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}
