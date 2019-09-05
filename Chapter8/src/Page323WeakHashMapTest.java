import java.util.WeakHashMap;

public class Page323WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap whm = new WeakHashMap();
        whm.put(new String("语文"), new String("良好"));
        whm.put(new String("数学"), new String("还行"));
        whm.put(new String("英语"), new String("糟透了"));

        whm.put("java", new String("中等"));

        System.out.println(whm);

        System.gc();
        System.runFinalization();
        System.out.println(whm);

    }
}
