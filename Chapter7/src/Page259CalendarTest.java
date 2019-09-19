import java.util.Calendar;

public class Page259CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.getTime());


		c.set(2019, 9, 19, 10, 8, 03);
		System.out.println(c.getTime());


		//roll和add的用法相似，区别在于当被修改的字段超出允
		//许的范围时，add的上一位会进位，roll的上一位不会发生改变，下一位没有变化

		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());

		c.roll(Calendar.MONTH,8);
		System.out.println(c.getTime());


	}
}
