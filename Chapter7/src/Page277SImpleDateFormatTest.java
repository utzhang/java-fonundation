import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Page277SImpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy年中第D天");

        String dateStr = sdf1.format(d);
        System.out.println(dateStr);

        String str = "19###七月##24";
        SimpleDateFormat sdf2 = new SimpleDateFormat("y###MMM#111#d");
        System.out.println(sdf2.parse(str));
    }
}
