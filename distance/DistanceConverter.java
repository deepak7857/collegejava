package distance;

public class DistanceConverter {

    public static double meterToKm(double meter) {
        return meter / 1000;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMeter(double km) {
        return km * 1000;
    }

    public static double kmToMiles(double km) {
        return km / 1.60934;
    }
}
