import java.math.BigDecimal;


/**
 * BigDecimal类的测试类，BigDecimal类是用来解决double和float类精度丢失的问题的
 *
 * 结论：使用BigDecimal不要用double直接作为构造器参数，会不准，以String最好
 */
public class Page255BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		BigDecimal f3 = new BigDecimal(0.05);

		System.out.println("使用String作为BigDecimal的构造参数");
		System.out.println("0.05+0.01 = " + f1.add(f2));
		System.out.println("0.05-0.01 = " + f1.subtract(f2));
		System.out.println("0.05*0.01 = " + f1.multiply(f2));
		System.out.println("0.05/0.01 = " + f1.divide(f2));

		System.out.println("使用Double作为BigDecimal的构造参数");
		System.out.println("0.05+0.01 = " + f3.add(f2));
		System.out.println("0.05-0.01 = " + f3.subtract(f2));
		System.out.println("0.05*0.01 = " + f3.multiply(f2));
		System.out.println("0.05/0.01 = " + f3.divide(f2));



	}
}
