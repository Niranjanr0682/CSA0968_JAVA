public class S58 {

    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread-1");
        Thread thread2 = new MyThread("Thread-2");

        thread1.start();
        thread2.start();

        Runnable task1 = new MyRunnable("Runnable-1");
        Runnable task2 = new MyRunnable("Runnable-2");

        Thread thread3 = new Thread(task1);
        Thread thread4 = new Thread(task2);

        thread3.start();
        thread4.start();
    }

    static class MyThread extends Thread {
        private String threadName;

        MyThread(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            System.out.println(threadName + " is running with ID: " + Thread.currentThread().getId());
        }
    }
    static class MyRunnable implements Runnable {
        private String runnableName;

        MyRunnable(String name) {
            this.runnableName = name;
        }

        @Override
        public void run() {
            System.out.println(runnableName + " is running with ID: " + Thread.currentThread().getId());
        }
    }
}
