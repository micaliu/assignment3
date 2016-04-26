import com.google.inject.Inject;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by <a href="mailto:micahliu153@gmail.com">micah</a> on 2016/4/19.
 */
public class LocationTest {
    @Inject
    private Location location;
    @Test
    public void inputTxtStringTest(){
        location = Location.parse("TAPPAHANNOCK, VA 22560");
        Assert.assertEquals(location.city,"TAPPAHANNOCK");
        Assert.assertEquals(location.state,"VA");
        Assert.assertEquals(location.zip,"22560");
    }

}