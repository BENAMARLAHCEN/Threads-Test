package Threads;

public class ThreadInterface implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public ThreadInterface() {
        System.out.println("Thread is created...");
    }

    public static void main(String[] args) {
        ThreadInterface threadInterface = new ThreadInterface();
        Thread thread = new Thread(threadInterface);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}
class TestThread {
    public static void main(String args[]) {
        ThreadDemo thread1 = new ThreadDemo( "Thread-1");
        ThreadDemo thread2 = new ThreadDemo( "Thread-2");
        thread1.start();
        thread2.start();
    }
    static void test() {
        System.out.println("fcv");
    }
    static void test(String s) {
        System.out.println(s);
    }
}
