import java.util.Scanner;
import currency.CurrencyConverter;
import distance.DistanceConverter;
import time.TimeConverter;

public class curr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Converter Application ---");
            System.out.println("1. Currency Converter");
            System.out.println("2. Distance Converter");
            System.out.println("3. Time Converter");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    currencyConversion(sc);
                    break;
                case 2:
                    distanceConversion(sc);
                    break;
                case 3:
                    timeConversion(sc);
                    break;
                case 0:
                    System.out.println("Exiting Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }

    private static void currencyConversion(Scanner sc) {
        System.out.println("\n--- Currency Converter ---");
        System.out.println("1. Dollar to INR");
        System.out.println("2. Euro to INR");
        System.out.println("3. Yen to INR");
        System.out.println("4. INR to Dollar");
        System.out.println("5. INR to Euro");
        System.out.println("6. INR to Yen");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        switch (option) {
            case 1:
                System.out.println("In INR: " + CurrencyConverter.dollarToInr(amount));
                break;
            case 2:
                System.out.println("In INR: " + CurrencyConverter.euroToInr(amount));
                break;
            case 3:
                System.out.println("In INR: " + CurrencyConverter.yenToInr(amount));
                break;
            case 4:
                System.out.println("In Dollar: " + CurrencyConverter.inrToDollar(amount));
                break;
            case 5:
                System.out.println("In Euro: " + CurrencyConverter.inrToEuro(amount));
                break;
            case 6:
                System.out.println("In Yen: " + CurrencyConverter.inrToYen(amount));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void distanceConversion(Scanner sc) {
        System.out.println("\n--- Distance Converter ---");
        System.out.println("1. Meter to KM");
        System.out.println("2. Miles to KM");
        System.out.println("3. KM to Meter");
        System.out.println("4. KM to Miles");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        System.out.print("Enter distance: ");
        double distance = sc.nextDouble();

        switch (option) {
            case 1:
                System.out.println("In KM: " + DistanceConverter.meterToKm(distance));
                break;
            case 2:
                System.out.println("In KM: " + DistanceConverter.milesToKm(distance));
                break;
            case 3:
                System.out.println("In Meter: " + DistanceConverter.kmToMeter(distance));
                break;
            case 4:
                System.out.println("In Miles: " + DistanceConverter.kmToMiles(distance));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void timeConversion(Scanner sc) {
        System.out.println("\n--- Time Converter ---");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Hours to Seconds");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Seconds to Hours");
        System.out.print("Choose an option: ");
        int option = sc.nextInt();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("In Minutes: " + TimeConverter.hoursToMinutes(time));
                break;
            case 2:
                System.out.println("In Seconds: " + TimeConverter.hoursToSeconds(time));
                break;
            case 3:
                System.out.println("In Hours: " + TimeConverter.minutesToHours(time));
                break;
            case 4:
                System.out.println("In Hours: " + TimeConverter.secondsToHours(time));
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
