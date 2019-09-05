import java.util.HashMap;
import java.util.Map;

public class Page314MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("多兰剑", 450);
        map.put("提亚马特", 1325);
        map.put("净蚀", 1250);
        map.put("三项之力", 3733);

        System.out.println(map.put("多兰剑", 1325));

        System.out.println(map);

        System.out.println("是否包含值为提亚马特的key: " + map.containsKey("提亚马特"));
        System.out.println("是否包含值为1325的value: " + map.containsValue(1325));
        for (Object key : map.keySet()) {
            System.out.println(key + "=====>" + map.get(key));
        }

        map.remove("三项之力");
        System.out.println(map);

    }
}
