// Conversion class provides methods to convert measurements between feet and meters.
public class Conversion
{
    // Converts a given value in feet to meters.
    // meter = 0.305 * foot.
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }

    // Converts a given value in meters to feet.
    // foot = 3.279 * meter.
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}
