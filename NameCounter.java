import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
class NameCounter {
    public int count(String text) {
        // Створюємо регулярний вираз для власних назв (слова, що починаються з великої літери)
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z0-9]*\\b");

        // Створюємо відповідний об'єкт для пошуку
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        // Підраховуємо кількість власних назв
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
