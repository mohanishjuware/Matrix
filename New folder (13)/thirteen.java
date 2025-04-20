import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarApp {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
