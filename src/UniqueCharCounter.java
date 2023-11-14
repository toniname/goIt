class UniqueCharCounter {

    public int count(String phrase) {
        // Створюємо масив boolean для відстеження унікальних символів (ASCII символи)
        boolean[] uniqueChars = new boolean[128]; // ASCII таблиця містить 128 символів

        // Лічильник унікальних символів
        int count = 0;

        // Проходимося по кожному символу у рядку
        for (char character : phrase.toCharArray()) {
            int index = (int) character; // Переводимо символ у числовий індекс

            // Якщо символ ще не був позначений як унікальний, то позначаємо його
            if (!uniqueChars[index]) {

                uniqueChars[index] = true;
                count++;
            }
        }
        // Повертаємо кількість унікальних символів
        return count;
    }
}
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
