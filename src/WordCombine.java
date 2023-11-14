class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("KDFJIJLO", "okdi"));

        //true
        System.out.println(new WordCombine().canCombine("GXEUOOBLR", "goxule"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}
class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        // Створюємо копії рядків для подальшого використання
        String source = sourceWord.toLowerCase();
        String target = targetWord.toLowerCase();

        // Перебираємо літери слова targetWord
        for (char targetChar : target.toCharArray()) {
            boolean found = false;
            int sourceIndex = 0; // Скидаємо індекс на кожній ітерації

            // Шукаємо літеру targetChar в слові sourceWord
            while (sourceIndex < source.length()) {
                if (source.charAt(sourceIndex) == targetChar) {
                    found = true;
                    break;
                }
                sourceIndex++;
            }

            // Якщо не знайдено потрібну літеру, повертаємо false
            if (!found) {
                return false;
            }
        }

        return true; // Всі літери з targetWord були знайдені у sourceWord
    }
}

