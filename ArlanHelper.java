package java_core_grom.mateAkademi.treni.goIt;

public class ArlanHelper {

    public String drawQuad(int n) {
        String star = "";
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                star += "*";
                j++;
            }
            star += "\n";
            i++;
        }
        return star;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                result += c;
                j++;
            }
            result += "\n";
            i++;
        }
        return result;
    }

    public String drawLine(int length) {
        String result = ""; // Рядок для зберігання результату
        int i = 0; // Лічильник для символів

        while (i < length) { // Цикл для символів
            if (i % 2 == 0) {
                result += "*"; // Додаємо символ '*' до результату, якщо i парне
            } else {
                result += "#"; // Додаємо символ '#' до результату, якщо i непарне
            }
            i++; // Збільшуємо лічильник символів
        }

        return result; // Повертаємо результат
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String result = "";
        int i = 0;
        while (i < repeatCount) {
            int j = 0;
            while (j < pattern.length){
                result += pattern[j];
                j++;
            }
            i++;
        }


        return result;
    }



    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        char[] names = new char[]{'d', 'f', '+'};
        System.out.println(helper.drawQuad(2));
        System.out.println(helper.drawRect(2, 3, 'X'));
        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}