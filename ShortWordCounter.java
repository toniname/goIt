class ShortWordCounter {
    String phrase;
    int minLength;

    public int count(String phrase, int minLength) {
        String[] words = phrase.split(" ");

        int i = 0;

        for (String w : words) {
            if (w.length() <= minLength){
                i++;
            }
        }

        return i;
    }

}
class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}
