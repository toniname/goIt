package modul10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileToJsonConverter{
    public static void main(String[] args) {
        String inputFile = "file.txt";
        String outputFile = "user.json";
        // Зчитати користувачів з файлу
        List<User> userList = readUsersFromFile(inputFile);
        // Записати користувачів у файл у форматі JSON
        writeUsersToJsonFile(userList, outputFile);
    }

    // Метод для зчитування користувачів з файлу та створення об'єктів User
    private static List<User> readUsersFromFile(String fileName) {
        List<User> userList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String header = reader.readLine(); // Читаємо заголовок (перший рядок)

            String line;
            while ((line = reader.readLine()) != null) {
                // Розбиваємо рядок на частини за пробілами
                String[] parts = line.split("\\s+");
                // Отримуємо дані про ім'я та вік
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                // Створюємо об'єкт User та додаємо його до списку
                userList.add(new User(name, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userList;
    }

    // Метод для запису користувачів у файл у форматі JSON
    private static void writeUsersToJsonFile(List<User> userList, String fileName) {
        // Створюємо об'єкт Gson для конвертації об'єктів у JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(fileName)) {
            // Конвертуємо список користувачів в JSON та записуємо у файл
            gson.toJson(userList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}