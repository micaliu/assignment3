/**
 * Created by <a href="mailto:micahliu153@gmail.com">micah</a> on 2016/4/18.
 */
interface PackageTrackingReader {
    PackageTracking read(String carrier, String trackingNumber);
}
