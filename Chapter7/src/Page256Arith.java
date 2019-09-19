import java.math.BigDecimal;

public class Page256Arith {
	private static final int DEF_DIV_SCALE = 10;

	private Page256Arith() {

	}

	public static double add(double d1, double d2) {
		BigDecimal b1 = BigDecimal.valueOf(d1);
		BigDecimal b2 = BigDecimal.valueOf(d2);
		return b1.add(b2).doubleValue();
	}

	public static double sub(double d1, double d2) {
		BigDecimal b1 = BigDecimal.valueOf(d1);
		BigDecimal b2 = BigDecimal.valueOf(d2);
		return b1.subtract(b2).doubleValue();
	}

	public static double mul(double d1, double d2) {
		BigDecimal b1 = BigDecimal.valueOf(d1);
		BigDecimal b2 = BigDecimal.valueOf(d2);
		return b1.multiply(b2).doubleValue();
	}

	public static double div(double d1, double d2) {
		BigDecimal b1 = BigDecimal.valueOf(d1);
		BigDecimal b2 = BigDecimal.valueOf(d2);

		//返回相对精确的除法运算，b1/b1，除不尽则保留DEF_DIV_SCALE位四舍五入
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	public static void main(String[] args) {
		System.out.println("0.05+0.01: " + Page256Arith.add(0.05, 0.01));
		System.out.println("1.0+0.42: " + Page256Arith.sub(1.0, 0.42));
		System.out.println("4.015*100: " + Page256Arith.mul(4.015, 100));
		System.out.println("123.3/100: " + Page256Arith.div(123.3, 100));

	}
}
