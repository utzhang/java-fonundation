public class Page738DrawTest {
	public static void main(String[] args) {
		Page738Account acct = new Page738Account("1234567", 1000);

		new Page738DrawThread("甲", acct, 800).start();
		new Page738DrawThread("乙", acct, 800).start();

	}

}
