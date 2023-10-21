import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MathDetector {

    public boolean isMath(String text) {
// Регулярний вираз для пошуку математичних виразів
        String regex = "\\b\\d+\\s*[+\\-*/]\\s*\\d+\\b";

        // Створюємо об'єкт Pattern для регулярного виразу
        Pattern pattern = Pattern.compile(regex);

        // Створюємо об'єкт Matcher для тексту
        Matcher matcher = pattern.matcher(text);

        // Якщо знайдено відповідні математичні вирази, повертаємо true
        return matcher.find();
    }

}
class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
