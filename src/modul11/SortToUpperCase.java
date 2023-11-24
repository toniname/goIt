package modul11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Завдання 2
//Метод приймає на вхід список рядків (можна взяти список із Завдання 1). Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
public class SortToUpperCase {

    public static List<String> convertAndSortList(List<String> inputList) {

        List<String> result = inputList.stream()
                .map(String::toUpperCase)//конвертувати кожен рядок в верхній регістр
                .sorted(Comparator.reverseOrder())//впровадити сортування за спаданням
                .collect(Collectors.toList());//зібрати відсортований список

        return result;

    }
    public static void main(String[] args) {

        List<String> inputList = List.of("Adsdsd", "Terewt", "Wgdgdg", "Riwi");
        List<String> resultList = convertAndSortList(inputList);

        // Виведення результату
        System.out.println(resultList);
    }

}
