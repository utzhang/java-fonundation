public class Page726JoinThread extends Thread {
	public Page726JoinThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) throws Exception {
		new Page726JoinThread("新线程").start();
		for (int i = 0; i < 100; i++) {
			if (i == 20) {
				Page726JoinThread jt = new Page726JoinThread("被Join的线程");
				jt.start();
				jt.join();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
