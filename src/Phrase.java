import java.util.Arrays;

class Phrase {
    private final String[] words;

    public Phrase(String[] words) { // Arrays.copyOf(), щоб створити копію масиву words при конструюванні об'єкта Phrase.
        // Це гарантує іммутабельність класу, і зміни в оригінальному масиві не вплинуть на об'єкт Phrase.
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        return String.join(" ", words);
    }
}
class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}
