package modul11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//Є масив:["1, 2, 0", "4, 5"]
//Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
//"0, 1, 2, 4, 5"
public class ArraySort {

    public static String ArrSort(String[] inputArr) {
        String result = Arrays.stream(inputArr)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))// конвертує рядки у числа, сортує їх, а потім об'єднує в рядок з використанням , як роздільника ","
                .map(Integer::parseInt)//Перетворює кожну стрічку, яка представляє числовий рядок, в відповідний об'єкт класу Integer.
                .sorted()//Сортує елементи потоку в природньому порядку (за зростанням).
                .map(Object::toString)//Перетворює кожне число у потоці в його строкове представлення
                .collect(Collectors.joining(", "));//Збирає всі об'єкти у потоці в одну строку, використовуючи кому та пробіл як роздільник між ними.
        return result;
    }

    public static void main(String[] args) {
        String[] inputArr = {"1, 2, 0", "4, 5"};

        System.out.println(ArrSort(inputArr));
    }
}
