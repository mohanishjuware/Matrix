public class LoanChecker {
    public static void main(String[] args) {
        int age = 30;
        int salary = 40000;
        boolean eligible = age >= 21 && salary >= 25000;
        System.out.println("Loan Eligibility: " + (eligible ? "Approved" : "Denied"));
    }
}
