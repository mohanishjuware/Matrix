public class FuelCost {
    public static void main(String[] args) {
        double distance = 250; // km
        double mileage = 15; // km/l
        double pricePerLitre = 105; // INR
        double fuelRequired = distance / mileage;
        double cost = fuelRequired * pricePerLitre;
        System.out.println("Total Fuel Cost: ₹" + cost);
    }
}
