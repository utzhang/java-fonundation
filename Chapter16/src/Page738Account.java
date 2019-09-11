import java.util.concurrent.locks.ReentrantLock;

public class Page738Account {

	//定义锁对象
	private final ReentrantLock lock = new ReentrantLock();

	private String accountNo;
	private double balance;

	public Page738Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	// public void setBalance(double balance) {
	// 	this.balance = balance;
	// }

	public int hashCode(){
		return accountNo.hashCode();
	}

	public boolean equals(Object obj){
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Page738Account.class) {
			Page738Account target = (Page738Account) obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}

	public  void draw(double drawAmount) {

		lock.lock();
		try{
			if (getBalance() >= drawAmount) {
				System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票" + drawAmount);


				try {
					Thread.sleep(1);

				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}

				balance -= drawAmount;
				System.out.println("\t 余额为：" + balance);

			} else {
				System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
			}

		}finally {
			lock.unlock();
		}


	}
}
