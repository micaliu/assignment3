import com.google.inject.Inject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


/**
 * Created by <a href="mailto:micahliu153@gmail.com">micah</a> on 2016/4/19.
 */
public class WebPageTrackingReaderTest {
    @Inject
    private WebPageTrackingReader webReader;
    @Test
    public void parseValidWebPageTrackingReader(){

        try {
            Document doc = Jsoup.parse(new File("C:\\Users\\ibtadmin\\IdeaProjects\\SE500-Micah\\src\\main\\resources\\USPS_9200199999977453249942.html"),"UTF-8");
            PackageTracking packageTracking = WebPageTrackingReader.parse("usps","9200199999977453249942",doc);
            Assert.assertEquals(packageTracking.tracking_history.size(),6);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}