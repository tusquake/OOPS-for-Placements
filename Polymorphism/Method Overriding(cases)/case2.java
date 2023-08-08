class parent {
    private void m1() {
        System.out.println("Tussu");
    }
}

class Child extends parent {
    private void m1() {
        System.out.println("Mussu");
    }
}

public class case2 {
    public static void main(String[] args) {
        parent p = new parent();
        // p.m1();

        child ch = new child();
        // ch.m1();

    }
}

// declaring private variables in parent and child function with same signature
// is allowed but
// overriding the methods is not allowed in this case