import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Page285CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet();

        books.add("Spring微服务实战");
        books.add("学Java从入门到放弃");
        books.add("第一行代码");

        //Collection的forEach方法用Lambda表达式遍历集合
        //books.forEach(obj -> System.out.println("迭代集合元素：" + obj));

        //用Iterator接口实现遍历
        //Iterator it = books.iterator();
        //while (it.hasNext()) {
        //    String book = (String) it.next();
        //    System.out.println(book);
        //    if (book.equals("第一行代码")) {
        //        it.remove();
        //    }
        //    book = "测试字符串";
        //}
        //System.out.println(books);

        //Lambda表达式遍历
        //Iterator it = books.iterator();
        //it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));

        for (Object obj : books) {
            String book = (String) obj;
            System.out.println(book);
        }


    }
}
