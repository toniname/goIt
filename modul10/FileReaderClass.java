package modul10;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {


    public static void readFile() {
        try (FileReader reader = new FileReader("test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}
