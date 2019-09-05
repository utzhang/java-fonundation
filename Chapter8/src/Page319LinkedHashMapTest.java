import java.util.LinkedHashMap;

public class Page319LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap();
        scores.put("语文", 80);
        scores.put("数学", 90);
        scores.put("英语", 59);

        scores.forEach((key, value) -> System.out.println(key + "===>" + value));
    }
}
