class WordDeleter {

    public String remove(String phrase, String[] words) {

        String[] phraseWords = phrase.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : phraseWords) {

            if (!containsWord(word, words)) {

                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    private boolean containsWord(String word, String[] words) {

        for (String w : words) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }

}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
    }
}