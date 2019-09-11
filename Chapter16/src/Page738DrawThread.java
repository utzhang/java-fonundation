public class Page738DrawThread extends Thread {

	private Page738Account account;
	private double drawAmount;

	public Page738DrawThread(String name, Page738Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	public void run() {
		//将account作为临界资源，用synchronized锁起来
		account.draw(drawAmount);
	}
}
