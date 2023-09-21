import java.util.Arrays;

public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] aggregated = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            aggregated[i] = aggregateSingle(names[i], String.valueOf(ages[i]), planets[i]);
        }

        return aggregated;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"hter", "pou", "diz"};
        int[] ages = new int[]{30, 35, 70};
        String[] planets = new String[]{"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        String[] aggregatedNames = harekDataMaker.aggregateAll(names, ages, planets);

        for (String aggregatedName : aggregatedNames) {
            System.out.println(aggregatedName);
        }
    }

}
