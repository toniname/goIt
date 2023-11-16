package modul10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String fileName = "words.txt"; //Тут можна замінити це ім'ям якогось файлу
        Map<String, Integer> wordFrequencyMap = countWordFrequency(fileName);

        // Сортуємо результати за частотою та виводимо
        wordFrequencyMap.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    private static Map<String, Integer> countWordFrequency(String fileName) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Розділяємо слова за пробілами
                for (String word : words) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordFrequencyMap;
    }
}
