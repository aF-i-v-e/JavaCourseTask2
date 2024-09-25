package org.example.task5;

public class Timer implements Task {
    private int time; // Время в секундах
    private boolean isRunning; // Статус таймера
    private Thread timerThread;

    Timer(int time) {
        this.time = time;
        this.isRunning = false;
    }

    private void initTimerThread() {
        timerThread = new Thread(() -> {
            System.out.println("Начинаю обратный отсчёт:" );
            while (time > 0 && isRunning) {
                System.out.printf("Осталось времени: %1$d секунд\n", time);
                time--;
                try {
                    Thread.sleep(1000); // Задержка на одну секунду
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Таймер был прерван!" );
                }
            }
            if (time == 0) {
                System.out.println("Время вышло!" );
                isRunning = false;
            }
        });
    }

    @Override
    public void start() {
        if (isRunning) {
            System.out.println("Таймер уже запущен!" );
            return;
        }

        isRunning = true;
        initTimerThread();
        timerThread.start();
    }

    @Override
    public void stop() {
        isRunning = false;
        if (timerThread != null) {
            timerThread.interrupt();
        }
        System.out.println("Таймер остановлен." );
    }
}
