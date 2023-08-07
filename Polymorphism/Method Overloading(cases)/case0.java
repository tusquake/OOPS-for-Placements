public class case0 {
    public void m1() {
        System.out.println("No-args version");
    }

    public void m1(int i) {
        System.out.println("int-args version");
    }

    public void m1(double d) {
        System.out.println("double-args version");
    }

    public static void main(String[] args) {
        case0 c = new case0();
        c.m1(); // No-args version
        c.m1(5); // int-args version
        c.m1(5.5);// double-args version
    }

}