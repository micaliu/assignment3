import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.text.ParseException;


/**
 * Created by <a href="mailto:micahliu153@gmail.com">micah</a> on 2016/4/18.
 */
public class Excute {
    public static void main(String[] args) throws IOException, ParseException {
//        PackageTrackingReader[] readers = {new ShippoAPIWrapper(), new WebPageTrackingReader()};
//        for (PackageTrackingReader packageTrackingReader : readers) {
//            PackageTracking tracking = packageTrackingReader.read("usps", "9200199999977453249942");
//            System.out.println(JSON.toJSONString(tracking, true));
//        }
//        PackageTracking shippoApi= readers[0].read("usps", "9200199999977453249942");
//        PackageTracking webPage = readers[1].read("usps", "9200199999977453249942");
//        if (shippoApi.tracking_history.size()==webPage.tracking_history.size()){
//            System.out.print("their size matched.");
//        }

        PackageTrackingReader reader = new WebPageTrackingReader();
        PackageTracking webTracking = reader.read("usps", "9200199999977453249942");
        System.out.println(JSON.toJSONString(webTracking, true));
    }
}
