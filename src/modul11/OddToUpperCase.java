package modul11;

import java.util.List;
import java.util.stream.Collectors;

public class OddToUpperCase {

    public static List<String> convertAndSortList(List<String> inputList) {

        List<String> result = inputList.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        return result;

    }
    public static void main(String[] args) {
        // Приклад використання
        List<String> inputList = List.of("Adsdsd", "Terewt", "Wgdgdg", "Riwi");
        List<String> resultList = convertAndSortList(inputList);

        // Виведення результату
        System.out.println(resultList);
    }

}
