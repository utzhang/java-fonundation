package lambda;

public class Page199AddCommand implements Page198Command {

	@Override
	public void process(int[] target) {
		int sum = 0;
		for (int temp : target) {
			sum = temp + sum;
		}
		System.out.println("元素总和为：" + sum);
	}
}
