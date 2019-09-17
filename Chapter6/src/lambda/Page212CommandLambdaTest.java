package lambda;

public class Page212CommandLambdaTest {
	public static void main(String[] args) {
		Page198ProcessArray pa = new Page198ProcessArray();
		int[] array = {3, -4, 6, 4};
		pa.process(array, (int[] target) ->{
			int sum = 0;
			for (int tmp : target) {
				sum += tmp;
			}
			System.out.println("数组总和为: " + sum);
		});

	}
}
