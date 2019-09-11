public class Page736DrawThread extends Thread {

	private Page735Account account;
	private double drawAmount;

	public Page736DrawThread(String name, Page735Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	public void run() {
		//将account作为临界资源，用synchronized锁起来
		account.draw(drawAmount);
	}
}
