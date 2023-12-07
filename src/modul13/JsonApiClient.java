package modul13;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JsonApiClient {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users";

    public static String createUser(String json) {
        return sendRequest(BASE_URL, "POST", json);
    }

    public static String updateUser(int userId, String json) {
        String url = BASE_URL + "/" + userId;
        return sendRequest(url, "PUT", json);
    }

    public static int deleteUser(int userId) {
        String url = BASE_URL + "/" + userId;
        return sendDeleteRequest(url);
    }

    public static String getAllUsers() {
        return sendRequest(BASE_URL, "GET", null);
    }

    public static String getUserById(int userId) {
        String url = BASE_URL + "/" + userId;
        return sendRequest(url, "GET", null);
    }

    public static String getUserByUsername(String username) {
        String url = BASE_URL + "?username=" + username;
        return sendRequest(url, "GET", null);
    }

    private static String sendRequest(String url, String method, String json) {
        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            connection.setRequestMethod(method);

            if (json != null) {
                connection.setDoOutput(true);
                connection.getOutputStream().write(json.getBytes(StandardCharsets.UTF_8));
            }


            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int sendDeleteRequest(String url) {
        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            connection.setRequestMethod("DELETE");

            AtomicInteger responseCode = new AtomicInteger(connection.getResponseCode());
            return responseCode.get();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    public static void getUserLastPostCommentsAndSaveToFile(int userId) {
        String userPosts = getAllUserPosts(userId);

        JsonArray postsArray = JsonParser.parseString(userPosts).getAsJsonArray();

        postsArray.forEach(post -> {
            int postId = post.getAsJsonObject().get("id").getAsInt();
            System.out.println("Debug: Processing post with id " + postId);

            if (postId == getLastPostId(postsArray)) {
                String postComments = getPostComments(postId);
                saveCommentsToFile(userId, postId, postComments);
            }
        });
    }

    private static int getLastPostId(JsonArray postsArray) {
        return IntStream.range(0, postsArray.size())
                .map(index -> postsArray.get(index).getAsJsonObject().get("id").getAsInt())
                .max()
                .orElseThrow(() -> new RuntimeException("No posts found"));
    }



    private static String getAllUserPosts(int userId) {
        String url = BASE_URL + "/users/" + userId + "/posts";
        return sendHttpRequest(url);
    }

    private static String getPostComments(int postId) {
        String url = BASE_URL + "/posts/" + postId + "/comments";
        return sendHttpRequest(url);
    }

    private static void saveCommentsToFile(int userId, int postId, String comments) {
        String fileName = "user-" + userId + "-post-" + postId + "-comments.json";
        Path filePath = Paths.get(fileName);

        try (Writer writer = new FileWriter(filePath.toFile())) {
            writer.write(comments);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sendHttpRequest(String url) {
        // Ваш код для виконання HTTP-запиту та отримання даних
        // Приклад коду (може бути не точним для вашого випадку):
        // Використовуйте, наприклад, HttpURLConnection або бібліотеку, таку як Apache HttpClient
        return "";  // Замініть це на реальний результат запиту
    }


    public static void getUserOpenTasks(int userId) {
        String url = BASE_URL + "/users/" + userId + "/todos";
        String userTasks = sendHttpRequest(url);

        // Виводимо всі відкриті задачі користувача
        System.out.println("Open tasks for user with ID " + userId + ":");
        Stream.of(userTasks.split("\\},"))
                .map(task -> task + "}")  // Додаємо закриваючу фігурну дужку, що була відкинута
                .filter(task -> task.contains("\"completed\":false"))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        // код для тестування
        // Тестуємо створення нового користувача
        String newUserJson = "{ \"name\": \"John Doe\", \"username\": \"johndoe\", \"email\": \"john@example.com\" }";
        String createdUser = JsonApiClient.createUser(newUserJson);
        System.out.println("Created user: " + createdUser);

        // Тестуємо оновлення користувача
        int userIdToUpdate = 1; // Припустимо, що ми знаємо, що користувач з id=1 існує
        String updatedUserJson = "{ \"name\": \"Updated Name\" }";
        String updatedUser = JsonApiClient.updateUser(userIdToUpdate, updatedUserJson);
        System.out.println("Updated user: " + updatedUser);

        // Тестуємо видалення користувача
        int userIdToDelete = 2; // Припустимо, що ми знаємо, що користувач з id=2 існує
        int deleteResponseCode = JsonApiClient.deleteUser(userIdToDelete);
        System.out.println("Delete response code: " + deleteResponseCode);

        // Тестуємо отримання інформації про всіх користувачів
        String allUsers = JsonApiClient.getAllUsers();
        System.out.println("All users: " + allUsers);

        // Тестуємо отримання інформації про конкретного користувача за id
        int userIdToGet = 1; // Припустимо, що ми знаємо, що користувач з id=1 існує
        String userById = JsonApiClient.getUserById(userIdToGet);
        System.out.println("User by id: " + userById);

        // Тестуємо отримання інформації про користувача за username
        String usernameToGet = "johndoe"; // Припустимо, що такий користувач існує
        String userByUsername = JsonApiClient.getUserByUsername(usernameToGet);
        System.out.println("User by username: " + userByUsername);
    }
}
