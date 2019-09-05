public class Page148SubClass extends BaseClass {
    public String book = "son's book";

    public void test() {
        System.out.println("子类的覆盖父类的方法");
    }

    public void sub() {
        System.out.println("son's commom methods");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        Page148SubClass sc = new Page148SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();

        //编译时类型是BaseClass，运行时类型是Page148SubClass
        BaseClass ploymophicBc = new Page148SubClass();
        //访问的是baseclass的成员变量
        System.out.println(ploymophicBc.book);

        //访问的是Page148SubClass的成员方法
        ploymophicBc.test();
        ploymophicBc.base();
        //ploymophicBc.sub();

        //方法具有多态性，实例变量不具备多态性

    }


}

class BaseClass {
    public int book = 6;

    public void base() {
        System.out.println("father's common methods");
    }

    public void test() {
        System.out.println("父类被覆盖的方法");
    }
}


