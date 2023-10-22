import java.util.Arrays;

class WordSplitter {
    private String phrase;

    public String[] split(String phrase) {
        // Використовуємо метод split класу String для поділу рядка на слова за пробілами
        String[] words = phrase.split(" ");
        // Перетворюємо слова на нижній регістр (за вимогою)
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        String[] filteredWords = new String[words.length];
        int count = 0; // Лічильник для визначення кількості не порожніх слів
        // Фільтруємо масив, вилучаючи порожні рядки
        for (String word : words) {
            if (!word.isEmpty()) {
                filteredWords[count] = word;
                count++;

            }
        }

        // Створюємо новий масив, який містить тільки не порожні рядки
        String[] result = new String[count];
        System.arraycopy(filteredWords, 0, result, 0, count);

        return result;
    }
}
class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

