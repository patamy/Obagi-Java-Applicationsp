import java.util.Scanner;

public class ParkingCharges {
    public static double calculateCharges(double hours) {
        double charge = 2.0;
        if (hours > 3) {
            charge += Math.ceil(hours - 3) * 0.5;
        }
        return Math.min(charge, 10.0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0;

        for (int i = 1; i <= 3; i++) { // example for 3 customers
            System.out.print("Enter hours parked for customer " + i + ": ");
            double hours = input.nextDouble();
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            System.out.printf("Customer %d charge: $%.2f%n", i, charge);
        }

        System.out.printf("Total receipts: $%.2f%n", totalReceipts);
    }
}
