class Animal {

}

class Monkey extends Animal {

}

class case6 {
    public void m1(Animal a) {
        System.out.println("Animal version");
    }

    public void m1(Monkey m) {
        System.out.println("Monkey Version");
    }

    public static void main(String[] args) {
        case6 c = new case6();
        Animal a = new Animal();
        c.m1(a); // Animal version

        Monkey m = new Monkey();
        c.m1(m); // Monkey Version

        Animal am = new Monkey();
        c.m1(am); // Animal version
    }
}

// In Overloading method resolution always takes place on compiler based on
// reference types runtime obejct is dummy in overloading.
// Hence Overloading is also called as compile time polymorphism or static
// polymorphism or early Binding