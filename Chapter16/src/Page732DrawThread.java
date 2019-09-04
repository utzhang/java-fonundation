public class Page732DrawThread extends Thread {

	private Page732Account account;
	private double drawAmount;

	public Page732DrawThread(String name, Page732Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	public void run() {
		//将account作为临界资源，用synchronized锁起来
		synchronized (account) {

			if (account.getBalance() >= drawAmount) {
				System.out.println(getName() + "取钱成功！吐出钞票" + drawAmount);

			/*
			try {
				Thread.sleep(1);

			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			*/
				account.setBalance(account.getBalance() - drawAmount);
				System.out.println("\t 余额为：" + account.getBalance());

			} else {
				System.out.println(getName() + "取钱失败！余额不足！");
			}
		}
	}
}
