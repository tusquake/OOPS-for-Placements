class parent {
    public static void marry() {
        System.out.println("Parent");

    }
}

class child extends parent {
    public static void marry() {
        System.out.println("Child");
    }
}

public class case0 {
    public static void main(String[] args) {
        parent p = new parent();
        p.marry();// parent

        parent c = new child();
        c.marry();// parent

        child ch = new child();
        ch.marry();// child

    }
}

// If the method is static then it is not overdding but it is data hiding
// In method hiding method resolution always is taken care by the compiler based
// on reference types