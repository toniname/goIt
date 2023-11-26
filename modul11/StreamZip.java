package modul11;
//Завдання 5
//Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
// який "перемішує" елементи зі стрімів first та second, зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamZip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());

        IntStream indices = IntStream.range(0, Math.max(list1.size(), list2.size()));

        Stream<T> zippedStream = indices.mapToObj(index ->
                Stream.of(list1, list2)
                        .filter(list -> index < list.size())
                        .map(list -> list.get(index))
                        .collect(Collectors.toList())
        ).flatMap(Collection::stream);

        return zippedStream;
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8);

        Stream<Integer> zippedStream = zip(stream1, stream2);

        // Виведення результату
        zippedStream.forEach(System.out::println);
    }
}