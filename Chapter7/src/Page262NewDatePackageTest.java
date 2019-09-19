import java.time.*;

public class Page262NewDatePackageTest {
	public static void main(String[] args) {
		//--------Clock类的用法-----------
		System.out.println("==================");
		// 获取当前Clock
		Clock clock = Clock.systemUTC();
		// 通过Clock获取当前时刻
		System.out.println("当前时刻为：" + clock.instant());
		// 获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		System.out.println();



		//--------Duration类的用法-----------
		System.out.println("==================");
		Duration d = Duration.ofSeconds(6000);
		System.out.println("6000秒相当于" + d.toMinutes() + "分");
		System.out.println("6000秒相当于" + d.toHours() + "小时");
		System.out.println("6000秒相当于" + d.toDays() + "天");
		// 在clock基础上增加6000秒，返回新的Clock
		Clock clock2 = Clock.offset(clock, d);
		// 可看到clock2与clock1相差1小时40分
		System.out.println("当前时刻加6000秒为：" +clock2.instant());
		System.out.println();


		//--------Instant类的用法-----------
		System.out.println("=========Instant=========");
		// 获取当前时间
		Instant instant = Instant.now();
		System.out.println(instant);
		// instant添加6000秒（即100分钟），返回新的Instant
		Instant instant2 = instant.plusSeconds(6000);
		System.out.println(instant2);
		// 根据字符串中解析Instant对象
		Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
		System.out.println(instant3);
		// 在instant3的基础上添加5小时4分钟
		Instant instant4 = instant3.plus(Duration
				.ofHours(5).plusMinutes(4));
		System.out.println(instant4);
		// 获取instant4的5天以前的时刻
		Instant instant5 = instant4.minus(Duration.ofDays(5));
		System.out.println(instant5);
		System.out.println();



		//--------LocalDate类的用法-----------
		System.out.println("==================");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		// 获得2014年的第146天
		localDate = LocalDate.ofYearDay(2014, 146);
		System.out.println(localDate); // 2014-05-26
		// 设置为2014年5月21日
		localDate = LocalDate.of(2014, Month.MAY, 21);
		System.out.println(localDate); // 2014-05-21

		System.out.println();





		//--------LocalTime类的用法-----------
		System.out.println("==================");
		// 获取当前时间
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		// 设置为22点33分
		localTime = LocalTime.of(22, 33);
		System.out.println(localTime); // 22:33
		// 返回一天中的第5503秒
		localTime = LocalTime.ofSecondOfDay(5503);
		System.out.println(localTime); // 01:31:43
		System.out.println();




		//--------LocalDateTime类的用法-----------
		System.out.println("==================");
		// 获取当前日期、时间
		LocalDateTime localDateTime = LocalDateTime.now();
		// 当前日期、时间加上25小时３分钟
		LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
		System.out.println("当前日期、时间的25小时3分之后：" + future);
		System.out.println();




		//--------Year\YearMonth\MonthDay类的用法-----------
		System.out.println("==================");
		Year year = Year.now();
		System.out.println("current year is : " + year);
		year = year.plusYears(5);
		System.out.println("after 5 years is: " + year);

		//根据指定月份获取yearMonth
		YearMonth yearMonth = year.atMonth(10);
		System.out.println("year 年 10 月是：" + yearMonth);

		//当前年+5年-3月
		yearMonth = yearMonth.plusYears(5).plusMonths(3);
		System.out.println("+5年-3月后是：" + yearMonth);

		MonthDay md = MonthDay.now();
		System.out.println("当前月日：" + md);

		MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
		System.out.println("5月23日为：" + md2);
		System.out.println();


	}
}
