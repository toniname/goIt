package modul11;

import java.util.stream.Stream;
//Завдання 4
//Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
public class LcGenerator {

    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long seed = 123;  // початкове значення seed
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = generateRandomStream(seed, a, c, m);

        randomStream.limit(10).forEach(System.out::println);// Виводимо перші 10 елементів стріму для перевірки
    }
}


