import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by <a href="mailto:micahliu153@gmail.com">ibtadmin</a> on 2016/4/11.
 */
public class PackageTrackingTest {
    @Test
    public void parseFromJson(){
        PackageTracking tracking = JSON.parseObject("{\"carrier\": \"usps\", \"tracking_number\": \"9200199999977453249942\", \"tracking_status\": {\"object_created\": \"2016-04-06T23:13:22.365Z\", \"object_updated\": \"2016-04-06T23:13:22.365Z\", \"object_id\": \"7aa9f1f53ce441b18a8678b9e2b5eb0f\", \"status\": \"DELIVERED\", \"status_details\": \"Your shipment has been delivered to a PO box.\", \"status_date\": \"2016-04-04T08:20:00Z\", \"location\": {\"city\": \"Tappahannock\", \"state\": \"VA\", \"zip\": \"22560\", \"country\": \"US\"}}, \"tracking_history\": [{\"object_created\": \"2016-04-06T23:13:22.365Z\", \"object_id\": \"bf26b02ceb1f4dcd8e03385d74e603cd\", \"status\": \"TRANSIT\", \"status_details\": \"Your shipment has been accepted at the USPS origin facility.\", \"status_date\": \"2016-04-01T16:28:00Z\", \"location\": {\"city\": \"Moreno Valley\", \"state\": \"CA\", \"zip\": \"92551\", \"country\": \"US\"}}, {\"object_created\": \"2016-04-06T23:13:22.365Z\", \"object_id\": \"93eadfbe797e43308b7db9e9bee31801\", \"status\": \"TRANSIT\", \"status_details\": \"Your shipment has arrived at the USPS origin facility.\", \"status_date\": \"2016-04-01T17:43:00Z\", \"location\": {\"city\": \"Moreno Valley\", \"state\": \"CA\", \"zip\": \"92553\", \"country\": \"US\"}}, {\"object_created\": \"2016-04-06T23:13:22.365Z\", \"object_id\": \"794b8447da9043dead45bfaef1f77a2d\", \"status\": \"TRANSIT\", \"status_details\": \"Your shipment has arrived at the USPS destination facility.\", \"status_date\": \"2016-04-03T22:06:00Z\", \"location\": {\"city\": \"Sandston\", \"state\": \"VA\", \"zip\": \"23150\", \"country\": \"US\"}}, {\"object_created\": \"2016-04-06T23:13:22.365Z\", \"object_id\": \"b84e99c1623e4bc382f1251221f3137c\", \"status\": \"TRANSIT\", \"status_details\": \"Your shipment has departed the USPS facility.\", \"status_date\": \"2016-04-04T04:10:00Z\", \"location\": {\"city\": \"Sandston\", \"state\": \"VA\", \"zip\": \"23150\", \"country\": \"US\"}}, {\"object_created\": \"2016-04-06T23:13:22.365Z\", \"object_id\": \"d12227d0b58a4d61b2db510133a4a3d0\", \"status\": \"TRANSIT\", \"status_details\": \"Your shipment has arrived at the post office.\", \"status_date\": \"2016-04-04T06:32:00Z\", \"location\": {\"city\": \"Tappahannock\", \"state\": \"VA\", \"zip\": \"22560\", \"country\": \"US\"}}, {\"object_created\": \"2016-04-06T23:13:22.365Z\", \"object_id\": \"bb74bbe3d9d649fd8215591536f5e4b7\", \"status\": \"DELIVERED\", \"status_details\": \"Your shipment has been delivered to a PO box.\", \"status_date\": \"2016-04-04T08:20:00Z\", \"location\": {\"city\": \"Tappahannock\", \"state\": \"VA\", \"zip\": \"22560\", \"country\": \"US\"}}]}",PackageTracking.class);
        Assert.assertEquals(tracking.carrier,"usps");
        Assert.assertEquals(tracking.tracking_number,"9200199999977453249942");

    }

}
