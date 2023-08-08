class parent {
    public void m1() {
        System.out.println("Tussu");
    }
}

// Overring final classes is not possible

class Child extends parent {
    public void m1() {
        System.out.println("Mussu");
    }

    // Overidding final methods is not allowed
}

public class case3 {
    public static void main(String[] args) {
        parent p = new parent();
        p.m1();

        child ch = new child();
        ch.m1();

    }
}

// declaring private variables in parent and child function with same signature
// is allowed but
// overriding the methods is not allowed in this case