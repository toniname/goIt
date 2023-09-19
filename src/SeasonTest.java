class SeasonTest {
    public String test(Season season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest();

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn()));
    }
}

abstract class Season {
    public abstract String getName();
    public abstract boolean isCold();
}
class Winter extends Season{
    @Override
    public String getName() {
        return "winter";
    }
    @Override
    public boolean isCold() {
        return true;
    }
}
class Spring extends Season{
    @Override
    public String getName() {
        return "spring";
    }
    @Override
    public boolean isCold() {
        return false;
    }
}
class Summer extends Season{
    @Override
    public String getName() {
        return "summer";
    }
    @Override
    public boolean isCold() {
        return false;
    }
}
class Autumn extends Season{

    @Override
    public String getName() {
        return "autumn";
    }

    @Override
    public boolean isCold() {
        return true;
    }
}