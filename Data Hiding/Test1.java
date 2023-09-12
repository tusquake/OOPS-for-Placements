class parent {
    String s = "Parent";
}

class child extends parent {
    String s = "Child";
}

public class Test1 {
    public static void main(String[] args) {
        parent p = new parent();
        System.out.println(p.s);// parent

        parent pc = new child();
        System.out.println(pc.s);// parent

        child ch = new child();
        System.out.println(ch.s);// child

    }
}

// Overridng concepts only applicable for methods not for variables
// Variable resoltuion is always taken care by compiler based on reference types
