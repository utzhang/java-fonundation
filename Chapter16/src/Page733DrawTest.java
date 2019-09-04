public class Page733DrawTest {
	public static void main(String[] args) {
		Page732Account acct = new Page732Account("1234567", 1000);

		new Page732DrawThread("甲", acct, 800).start();
		new Page732DrawThread("乙", acct, 800).start();

	}

}
