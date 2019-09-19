import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Page279NewFormatterTest {
	public static void main(String[] args) {
		DateTimeFormatter[] dateTimeFormatters = new DateTimeFormatter[]{
				//使用常量创建DateTImeFormatter格式器
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,

				//不同的本地化风格来创建
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),

				//根据模式字符串来创建DateTimeFormatter格式器
				DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		};

		LocalDateTime date = LocalDateTime.now();

		for (int i = 0; i < dateTimeFormatters.length; i++) {
			System.out.println(date.format(dateTimeFormatters[i]));
			System.out.println(dateTimeFormatters[i].format(date));
		}

	}
}
