class parent {
    public Object marry() {
        return "Mussu";
    }
}

class child extends parent {
    public String marry() {
        // |_________________> Co-Varient return type is possible
        return "Tussu";
    }
}

public class case1 {
    public static void main(String[] args) {
        parent p = new parent();
        System.out.println(p.marry());

        child ch = new child();
        System.out.println(ch.marry());

        parent c = new child();
        System.out.println(c.marry());
    }
}

// 2--> Return types must be same in Overriding but this rule is apllicable
// until 1.4 version from 1.5 version co-variant return types are also allowed

// Covarient Return
// Type not applicable for
// primitives it
// is only
// applicable to
// non primitives