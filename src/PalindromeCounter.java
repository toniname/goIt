class PalindromeCounter {
    public int count(String phrase) {
        String[] words = phrase.split(" ");

        int count = 0; // Лічильник паліндромів

        // Перевіряємо кожне слово на паліндром та збільшуємо лічильник, якщо слово є паліндромом
        for (String word : words) {
            if (isPalindrome(word)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPalindrome(String word) {
        // Перевертаємо слово
        String reversedWord = new StringBuilder(word).reverse().toString();
        // Порівнюємо перевернуте слово з оригіналом, ігноруючи регістр літер
        return word.equalsIgnoreCase(reversedWord);
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
