package lambda;

public class Page212CommandTest {
	public static void main(String[] args) {
		Page198ProcessArray pa = new Page198ProcessArray();
		int[] target = {3, -4, 6, 4};
		pa.process(target, new Page198Command() {
			@Override
			public void process(int[] target) {
				int sum = 0;
				for (int temp : target) {
					sum += temp;
				}
				System.out.println("数组总和为：" + sum);
			}
		});
	}
}
