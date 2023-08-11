class parent {
    public void marry(int... i) {
        System.out.println("Parent");

    }
}

class child extends parent {
    public static void marry(int i) {
        System.out.println("Child");
    }
}

public class Test {
    public static void main(String[] args) {
        parent p = new parent();
        p.marry(10);// parent

        parent c = new child();
        c.marry(10);// parent

        child ch = new child();
        ch.marry(10);// child

    }
}

// We cant override var-args method with normal method if we try to do so it
// becomes method overloading hence method resolution always is taken care by
// the compiler based
// on reference types