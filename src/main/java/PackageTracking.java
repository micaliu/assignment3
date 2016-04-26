import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Date;

/**
 * Created by <a href="mailto:micahliu153@gmail.com">micah</a> on 2016/4/11.
 */
public class PackageTracking {
    public String carrier;
    public String tracking_number;
    public TrackingHistory tracking_status;
    public List<TrackingHistory> tracking_history;

    public static class TrackingHistory implements Comparable<TrackingHistory>
    {
        @JSONField(name = "status_date")
        public Date date;
        public String status;
        @JSONField(name = "status_details")
        public String details;
        public Location location;

        @Override
        public int compareTo(TrackingHistory h) {
            return this.date.compareTo(h.date);
        }
    }



}
