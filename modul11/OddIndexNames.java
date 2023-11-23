package modul11;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class OddIndexNames {

    public static String getOddIndexNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))//використовується для відображення (перетворення) елементів стріму в об'єкти іншого типу ["Ivan", "Peter", "Alice"],
                // після застосування mapToObj до стріму індексів, ми отримаємо стрім рядків ["1. Ivan", "2. Peter", "3. Alice"].
                .collect(Collectors.joining(", "));


    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Alice", "John", "Eva");
        String result = getOddIndexNames(names);
        System.out.println(result);
    }
}
