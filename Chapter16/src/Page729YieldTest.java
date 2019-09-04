public class Page729YieldTest extends Thread {
	public Page729YieldTest(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + " " + i);
			if(i == 20){
				System.out.println(i+""+getName());
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) throws Exception{
		Page729YieldTest yt1 = new Page729YieldTest("高级");
		// yt1.setPriority(Thread.MAX_PRIORITY);
		yt1.start();

		Page729YieldTest yt2 = new Page729YieldTest("低级");
		// yt2.setPriority(Thread.MIN_PRIORITY);
		yt2.start();
	}
}
