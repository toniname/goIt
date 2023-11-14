
class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase) {
        String[] sensitiveWords = {"pass", "key", "login", "email"};

        phrase = phrase.toLowerCase();
        for (String word : sensitiveWords) {
            if (phrase.contains(word.toLowerCase())) {
                return true;
            }

        }


        return false;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
