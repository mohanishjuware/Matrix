public class EmailValidator {
    public static void main(String[] args) {
        String email = "example@mail.com";
        boolean isValid = email.matches("^\\S+@\\S+\\.\\S+$");
        System.out.println("Email Valid: " + isValid);
    }
}
