package modul10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneValidator {

    public static boolean isValidNumber(String phoneNumber){

        Pattern pattern1 = Pattern.compile("\\(\\d{3}\\) \\d{3}-\\d{4}");

        Pattern pattern2 = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");

        Matcher matcher1 = pattern1.matcher(phoneNumber);
        Matcher matcher2 = pattern2.matcher(phoneNumber);

        return matcher1.matches() || matcher2.matches();
    }

    public static void main(String[] args) {

        String fileName = "file.txt"; // Замініть це ім'ям вашого файлу
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (isValidNumber(line)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
