import java.util.HashSet;

public class Page292HashSetTest {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());

        System.out.println(books);

    }
}

class A {
    public boolean equals(Object object) {
        return true;
    }
}

class B {
    public int hashCode() {
        return 1;
    }
}

class C {
    public int hashCode() {
        return 2;
    }

    public boolean equals(Object object) {
        return true;
    }
}
