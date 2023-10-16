import java.util.Arrays;

public class DigitExtracter {

    public int[] extract(String text) {
        StringBuilder digitBuilder = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isDigit(character)) {
                // Якщо символ є цифрою, додаємо його до StringBuilder
                digitBuilder.append(character);
            }
        }

        String digitString = digitBuilder.toString();
        int[] result = new int[digitString.length()];

        for (int i = 0; i < digitString.length(); i++) {
            // Перетворюємо кожен символ цифри в числове значення
            result[i] = Character.getNumericValue(digitString.charAt(i));
        }

        return result;
    }
}
class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
