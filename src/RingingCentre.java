
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author j3kaiii
 */
public class RingingCentre {
    private Map<Bird, List<String>> places;

    public RingingCentre() {
        places = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        if (!places.containsKey(bird)) {
            places.put(bird, new ArrayList<String>());
        }
        places.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
        if (places.containsKey(bird)) {
            System.out.println(bird + " observations: " + places.get(bird).size());
            for (String s : places.get(bird)) {
                System.out.println(s);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
        
    }
}
