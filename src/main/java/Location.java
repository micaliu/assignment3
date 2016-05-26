/**
 * Created by <a href="mailto:micahliu153@gmail.com">ibtadmin</a> on 2016/4/16.
 */
public class Location {
    public String city;
    public String state;
    public String zip;
    public String country;


    static Location parse(String locationTxt) {
        String[] array = locationTxt.split(",");
        Location location = new Location();
        if(array.length==2){
            location.city = array[0].trim();
            location.state = array[1].replaceAll("[^A-Z]", "");
            location.zip = array[1].replaceAll("[^0-9-]", "");
        }

        location.country = "US";
        return location;
    }
}
