package lambda;

public class Page199PrintCommand implements Page198Command {
	@Override
	public void process(int[] target) {
		for (int tmp : target) {
			System.out.println("迭代输出数组的元素：" + tmp);
		}
	}
}
