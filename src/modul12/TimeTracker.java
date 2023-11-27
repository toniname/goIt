package modul12;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimeTracker {

    public static void main(String[] args) {

        var startTime = LocalTime.now(); // Отримуємо час у момент запуску програми

        // Перший потік: виводимо час, що минув, кожну секунду
        Thread timeTrackerThread = new Thread(() -> {
            while (true) {

                LocalTime currentTime = LocalTime.now();// Отримуємо поточний час

                long secondsPassed = startTime.until(currentTime, ChronoUnit.SECONDS);// Визначаємо різницю у часі в секундах

                System.out.println("Час, що минув: " + secondsPassed + " секунд");// Виводимо інформацію про час, що минув

                try {

                    Thread.sleep(1000);// Почекайте одну секунду перед наступною ітерацією
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Другий потік: виводимо повідомлення кожні 5 секунд
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Минуло 5 секунд");
        }, 0, 5, TimeUnit.SECONDS);

        // Запускаємо обидва потоки
        timeTrackerThread.start();

        // Завершуємо роботу за 30 секунд 
        scheduledExecutorService.schedule(() -> {
            timeTrackerThread.interrupt();
            scheduledExecutorService.shutdown();
        }, 30, TimeUnit.SECONDS);


    }
}
