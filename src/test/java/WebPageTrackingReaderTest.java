import com.google.inject.Inject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;


/**
 * Created by <a href="mailto:micahliu153@gmail.com">micah</a> on 2016/4/19.
 */
public class WebPageTrackingReaderTest {
    @Inject
    private WebPageTrackingReader webReader;
    @Test
    public void parseValidWebPageTrackingReaderTest(){
        try {
            Document doc = Jsoup.parse(new File("src\\main\\resources\\USPS_9200199999977453249942.html"),"UTF-8");
            PackageTracking packageTracking = WebPageTrackingReader.parse("usps","9200199999977453249942",doc);
            Assert.assertEquals(packageTracking.tracking_history.size(),6);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void parseValidWebPageTrackingReaderSecondSTest(){

        try {
            Document doc = Jsoup.parse(new File("src\\main\\resources\\USPS_9400110200881976430106.html"),"UTF-8");
            PackageTracking packageTracking = WebPageTrackingReader.parse("usps","9400110200881976430106",doc);
            Assert.assertEquals(packageTracking.tracking_history.size(),11);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test(expected=NullPointerException.class)
    public void ParseInvalidPageTest(){
        try {
            Document doc = Jsoup.parse(new File("src\\main\\resources\\USPS_Invalid.html"),"UTF-8");
            webReader.validateDocument(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void dateParseTest(){
        try {
            Assert.assertEquals("Mon Apr 04 08:20:00 PDT 2016", WebPageTrackingReader.dateParse("April 4, 2016 , 8:20 am").toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void dateParseSecondTest(){
        try {
            Assert.assertEquals("Mon Apr 04 00:00:00 PDT 2016", WebPageTrackingReader.dateParse("April 4, 2016").toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
