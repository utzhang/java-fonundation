public class Page152Sub extends Base{
    private String name;

    public void test() {
        System.out.println("test method in son class");
    }

    public static void main(String[] args) {
        Page152Sub sub = new Page152Sub();
    }
}


class Base {
    public Base() {
        test();
    }

    public void test() {
        System.out.println("test method in father's class");
    }
}
