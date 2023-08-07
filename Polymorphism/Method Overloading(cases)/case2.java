public class case2 {
    public void m1(Object o) {
        System.out.println("Object Version");
    }

    public void m1(String s) {
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        case2 c = new case2();
        c.m1(new Object()); // Object Version
        c.m1("Tussu"); // String version
        c.m1(null); // String version
        // Object is the parent class of all the classes
        // so it comes into picture if child classes like in this case string
        // is present so it will be executed if it was not there or child class cant
        // execute then parent(Object Class) will
        // get a chance
    }
}
