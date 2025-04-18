public class PasswordStrength {
    public static void main(String[] args) {
        String password = "My@Password123";
        if (password.length() >= 8 && password.matches(".*[A-Z].*")
                && password.matches(".*[0-9].*") && password.matches(".*[@#$%^&+=].*")) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
