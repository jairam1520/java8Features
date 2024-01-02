package org.lambdaExp;

public class OddEvenPrinter {
    private static int count = 1;
    private static final int MAX_COUNT = 20;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Runnable oddTask = () -> {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                    }
                }
            }
        };

        Runnable evenTask = () -> {
            while (count <= MAX_COUNT) {
                synchronized (lock) {
                    if (count % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count++);
                    }
                }
            }
        };

        Thread oddThread = new Thread(oddTask, "OddThread");
        Thread evenThread = new Thread(evenTask, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}
