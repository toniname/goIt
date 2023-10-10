
public class SpaceUtils {

     public static final int PLANET_COUNT = 8;
     public static final String HOME_PLANET_NAME = "Earth";

     public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount) {
        String a = "1 planet";
        String b = "planets";
        if (planetCount == 1) {
            return a;
        } else {
            return planetCount + b;
        }

    }

    public static String generateStartMessage(String shipName, String time){
        return "Ship " + shipName + " start at " + time;
    }
}
