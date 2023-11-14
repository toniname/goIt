public class PunctuationMarkCounter {
    String phrase;

    public int count(String phrase) {

        int i = 0;
        for (char p : phrase.toCharArray()) {
            if (p == '.' || p == ',' || p == '!' || p == ':' || p == ';') {
                i++;
                //System.out.println(i);
            }
        }
        return i;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
