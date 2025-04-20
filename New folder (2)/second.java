import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        while (true) {
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Balance: ₹" + balance);
                case 2 -> {
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    balance += amt;
                }
                case 3 -> {
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    if (amt <= balance) balance -= amt;
                    else System.out.println("Insufficient balance!");
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
