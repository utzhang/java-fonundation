package lambda;


/**
 * 使用接口的实现，使同一个方法实现不同的功能
 */
public class Page198CommandTest {
	public static void main(String[] args) {
		Page198ProcessArray pa = new Page198ProcessArray();
		int[] target = {3, -4, 6, 4};

		pa.process(target, new Page199PrintCommand());
		pa.process(target,new Page199AddCommand());
	}
}
