import java.util.*;

public class ContactBook {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("John", "9876543210");
        contacts.put("Jane", "9123456789");

        contacts.forEach((name, number) -> System.out.println(name + ": " + number));
    }
}
