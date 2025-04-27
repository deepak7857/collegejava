package time;

public class TimeConverter {

    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }

    public static int hoursToSeconds(int hours) {
        return hours * 3600;
    }

    public static double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    public static double secondsToHours(int seconds) {
        return seconds / 3600.0;
    }
}
