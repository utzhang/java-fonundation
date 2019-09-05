import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Page276DateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date dt = new Date();

        Locale[] locales = {Locale.CHINA, Locale.US};

        DateFormat[] df = new DateFormat[24];

        for (int i = 0; i < locales.length; i++) {
            df[i * 12] = DateFormat.getDateInstance(DateFormat.SHORT, locales[i]);
            //df[i * 8 + 1] = DateFormat.getDateInstance(3, locales[i]);
            //df[i * 8 + 1] = DateFormat.getDateInstance(DateFormat.MEDIUM, locales[i]);
            df[i * 12 + 1] = DateFormat.getDateInstance(2, locales[i]);
            df[i * 12 + 2] = DateFormat.getDateInstance(DateFormat.LONG, locales[i]);
            //df[i * 8 + 2] = DateFormat.getDateInstance(1, locales[i]);
            df[i * 12 + 3] = DateFormat.getDateInstance(DateFormat.FULL, locales[i]);
            //df[i * 8 + 3] = DateFormat.getDateInstance(0, locales[i]);

            df[i * 12 + 4] = DateFormat.getTimeInstance(DateFormat.SHORT, locales[i]);
            df[i * 12 + 5] = DateFormat.getTimeInstance(DateFormat.MEDIUM, locales[i]);
            df[i * 12 + 6] = DateFormat.getTimeInstance(DateFormat.LONG, locales[i]);
            df[i * 12 + 7] = DateFormat.getTimeInstance(DateFormat.FULL, locales[i]);

            df[i * 12 + 8] = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,locales[i]);
            df[i * 12 + 9] = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, locales[i]);
            df[i * 12 + 10] = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, locales[i]);
            df[i * 12 + 11] = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, locales[i]);
        }

        for (int i = 0; i < locales.length; i++) {
            String tip = i == 0 ? "---中国日期格式---" : "---美国日期格式---";
            System.out.println(tip);

            System.out.println("SHORT格式的日期：" + df[i * 12].format(dt));
            System.out.println("MEDIUM格式的日期：" + df[i * 12 +1].format(dt));
            System.out.println("LONG格式的日期：" + df[i * 12 + 2].format(dt));
            System.out.println("FULL格式的日期：" + df[i * 12 + 3].format(dt));
            System.out.println("SHORT格式的时间：" + df[i * 12 + 4].format(dt));
            System.out.println("MEDIUM格式的时间：" + df[i * 12 + 5].format(dt));
            System.out.println("LONG格式的时间：" + df[i * 12 + 6].format(dt));
            System.out.println("FULL格式的时间：" + df[i * 12 + 7].format(dt));
            System.out.println("SHORT格式的日期时间：" + df[i * 12 + 8].format(dt));
            System.out.println("MEDIUM格式的日期时间：" + df[i * 12 + 9].format(dt));
            System.out.println("LONG格式的日期时间：" + df[i * 12 + 10].format(dt));
            System.out.println("FULL格式的日期时间：" + df[i * 12 + 11].format(dt));

        }
    }
}
