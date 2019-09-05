public class Page719SecondThread implements Runnable {
    private int i;
    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                Page719SecondThread st = new Page719SecondThread();
                new Thread(st,"new Thread 1").start();
                new Thread(st,"new Thread 2").start();

            }

        }
    }
}
