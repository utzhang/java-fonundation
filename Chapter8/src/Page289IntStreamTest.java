import java.util.stream.IntStream;

public class Page289IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .build();

        //System.out.println("is 所有元素的最大值：" + is.max().getAsInt());
        //System.out.println("is 所有元素的最小值：" + is.min().getAsInt());
        //System.out.println("is 所有元素的综合：" + is.sum());
        //System.out.println("is 所有元素的总数：" + is.count());
        //System.out.println("is 所有元素的平均值：" + is.average());
        //
        ////参数是个Predicate对象
        //System.out.println("is 所有元素的平方是否都大于20：" + is.allMatch(ele -> ele*ele>20));
        //System.out.println("is 是否包含任何元素的平方大于20：" + is.anyMatch(ele -> ele * ele > 20));
        IntStream newIs = is.map(ele -> ele * 2 + 1);
        newIs.forEach(System.out::println);
    }
}
