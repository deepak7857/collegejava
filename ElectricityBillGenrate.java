import java.util.Scanner;
class ElectricityBill {
    private int consumerNumber;
    private String consumerName;
    private int previousReading;
    private int currentReading;
    private String connectionType;

    // Constructor
    public ElectricityBill(int consumerNumber, String consumerName, int previousReading, int currentReading, String connectionType) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType.toLowerCase();
    }

    // Method to calculate bill amount
    public double calculateBill() {
        int unitsConsumed = currentReading - previousReading;
        double amount = 0;

        if (connectionType.equals("domestic")) {
            if (unitsConsumed <= 100) {
                amount = unitsConsumed * 1.0;
            } else if (unitsConsumed <= 200) {
                amount = (100 * 1.0) + ((unitsConsumed - 100) * 2.5);
            } else if (unitsConsumed <= 500) {
                amount = (100 * 1.0) + (100 * 2.5) + ((unitsConsumed - 200) * 4.0);
            } else {
                amount = (100 * 1.0) + (100 * 2.5) + (300 * 4.0) + ((unitsConsumed - 500) * 6.0);
            }
        } else if (connectionType.equals("commercial")) {
            if (unitsConsumed <= 100) {
                amount = unitsConsumed * 2.0;
            } else if (unitsConsumed <= 200) {
                amount = (100 * 2.0) + ((unitsConsumed - 100) * 4.5);
            } else if (unitsConsumed <= 500) {
                amount = (100 * 2.0) + (100 * 4.5) + ((unitsConsumed - 200) * 6.0);
            } else {
                amount = (100 * 2.0) + (100 * 4.5) + (300 * 6.0) + ((unitsConsumed - 500) * 7.0);
            }
        } else {
            System.out.println("Invalid connection type entered.");
        }

        return amount;
    }

    public void displayBill() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Number : " + consumerNumber);
        System.out.println("Consumer Name   : " + consumerName);
        System.out.println("Connection Type : " + connectionType);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading : " + currentReading);
        System.out.println("Units Consumed  : " + (currentReading - previousReading));
        System.out.println("Bill Amount     : Rs. " + calculateBill());
    }
}

public class ElectricityBillGenrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter Consumer Number: ");
        int consumerNumber = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Consumer Name: ");
        String consumerName = sc.nextLine();
        sc.nextLine(); // consume newline
        System.out.print("Enter Previous Month Reading: ");
        int previousReading = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Current Month Reading: ");
        int currentReading = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        String connectionType = sc.nextLine();

        // Create an object
        ElectricityBill bill = new ElectricityBill(consumerNumber, consumerName, previousReading, currentReading, connectionType);

        // Display the bill
        bill.displayBill();

        sc.close();
    }
}
