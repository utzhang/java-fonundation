public class Page736DrawTest {
	public static void main(String[] args) {
		Page735Account acct = new Page735Account("1234567", 1000);

		new Page736DrawThread("甲", acct, 800).start();
		new Page736DrawThread("乙", acct, 800).start();

	}

}
