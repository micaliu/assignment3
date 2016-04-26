import com.alibaba.fastjson.JSON;
import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Created by <a href="mailto:micahliu153@gmail.com">micah</a> on 2016/4/18.
 */
public class ShippoAPIWrapper implements PackageTrackingReader {

    @Override
    public PackageTracking read(String carrier, String trackingNumber) {
        String url = String.format("https://api.goshippo.com/v1/tracks/%s/%s", carrier, trackingNumber);
        try {
            String json = Jsoup.connect(url)
                    .ignoreContentType(true)
                    .header("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.112 Safari/537.36")
                    .header("Connection","keep-alive")
                    .timeout(6000)
                    .execute()
                    .body();
            return JSON.parseObject(json, PackageTracking.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
