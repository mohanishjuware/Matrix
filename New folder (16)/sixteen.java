import java.time.*;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2000, 4, 10);
        Period age = Period.between(dob, LocalDate.now());
        System.out.println("Age: " + age.getYears() + " years");
    }
}
