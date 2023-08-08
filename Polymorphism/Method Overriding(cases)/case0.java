class parent {
    public void property() {
        System.out.println("Gold|Land|Ca$h");
    }

    public void marry() {
        System.out.println("Appa|Subha");

    }
}

class child extends parent {
    public void marry() {
        System.out.println("katrina");
    }
}

public class case0 {
    public static void main(String[] args) {
        parent p = new parent();
        p.marry(); // Appa|Subha

        child ch = new child();
        ch.marry(); // katrina

        parent c = new child();
        c.marry(); // katrina

        // case0 c1 = new case0();

    }
}

// In method Overriding,method resolution is always based on
// runtime object,this responsibilty is taken care by JVM
// Hence Overriding is also known as run time polymorphism,
// Dynamic Polymorphism or Late Binding

// Rules:
// 1--> In method Overiding method signature should be same in both parent and
// child classes
// i.e, method name should be the same and the sequence of paramters should also
// be same

// 2--> Return types must be same in Overriding but this rule is apllicable
// until 1.4 version from 1.5 version co-variant return types are also allowed
