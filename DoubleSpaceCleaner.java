class DoubleSpaceCleaner {
    String phrase;
    public String clean(String phrase){
        // Видаляємо подвійні пробіли
        String cleanedPhrase = phrase.replaceAll("\\s+", " ");

        // Видаляємо пробіли на початку і в кінці рядка
        cleanedPhrase = cleanedPhrase.trim();

        return cleanedPhrase;
    }
}
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
