import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += sc.nextInt();
        }

        double average = total / (double) subjects;
        String grade = (average >= 90) ? "A" : (average >= 75) ? "B" : (average >= 50) ? "C" : "F";

        System.out.println("Grade: " + grade);
    }
}
