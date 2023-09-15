import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationid;
    private final String description;
    private final Map<Integer , String> exits ;

    public Location(int locationid, String description) {
        this.locationid = locationid;
        this.description = description;
        exits = new HashMap< Integer, String>();
        exits.put(locationid , description);
    }
    public void addexits(int locationid, String description){
        exits.put(locationid , description);
    }
    public int getLocationid() {
        return locationid;
    }

    public String getDescription() {
        return description;
    }

    public Map<Integer, String> getExits() {
        return new HashMap<Integer , String>(exits);
    }

}
