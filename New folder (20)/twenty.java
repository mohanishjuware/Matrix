public class WaterBill {
    public static void main(String[] args) {
        int consumption = 250; // in liters
        double bill = 0;

        if (consumption <= 100) bill = consumption * 2;
        else if (consumption <= 200) bill = 100 * 2 + (consumption - 100) * 3;
        else bill = 100 * 2 + 100 * 3 + (consumption - 200) * 5;

        System.out.println("Water Bill: ₹" + bill);
    }
}
