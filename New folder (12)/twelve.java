public class TrafficFine {
    public static void main(String[] args) {
        int speed = 90;
        if (speed > 80) {
            int fine = (speed - 80) * 10;
            System.out.println("Fine: ₹" + fine);
        } else System.out.println("No fine.");
    }
}
