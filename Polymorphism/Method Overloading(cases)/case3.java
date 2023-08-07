public class case3 {
    public void m1(String s) {
        System.out.println("String Version");
    }

    public void m1(StringBuffer sb) {
        System.out.println("String Buffer  Version");
    }

    public static void main(String[] args) {
        case3 c = new case3();
        c.m1("Tussu"); // String Version
        c.m1(new StringBuffer("Tussu")); // String Buffer Version
        // -->c.m1(null); //reference to m1 is ambigious
        // both method m1(String) in case3 and method m1(StringBuffer) in case 3
    }
}
