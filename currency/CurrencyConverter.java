package currency;

public class CurrencyConverter {

    public static double dollarToInr(double dollar) {
        return dollar * 83.0; // Example rate
    }

    public static double euroToInr(double euro) {
        return euro * 89.0; // Example rate
    }

    public static double yenToInr(double yen) {
        return yen * 0.55; // Example rate
    }

    public static double inrToDollar(double inr) {
        return inr / 83.0;
    }

    public static double inrToEuro(double inr) {
        return inr / 89.0;
    }

    public static double inrToYen(double inr) {
        return inr / 0.55;
    }
}
