package my.dhlee.counter;

public class RaceConditionDemo {

    public static void main(String[] args) {
        final Counter counter = new Counter();

        final Thread thread1 = new Thread(counter, "Thread-1");
        final Thread thread2 = new Thread(counter, "Thread-2");
        final Thread thread3 = new Thread(counter, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
