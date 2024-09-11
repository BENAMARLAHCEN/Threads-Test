package Threads;

public class Miltithreading extends Thread {
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

    public static void main(String[] args) {
        Miltithreading miltithreading = new Miltithreading();
        miltithreading.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}

class Miltithreadingtest {
    public static void main(String args[]) {
        Miltithreading thread1 = new Miltithreading();
        Miltithreading thread2 = new Miltithreading();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        thread2.start();
    }

}