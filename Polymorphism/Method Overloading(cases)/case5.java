public class case5 {
    public void m1(int i, float f) {
        System.out.println("int-float version");
    }

    public void m1(float f, int i) {
        System.out.println("float-int version");
    }

    public static void main(String[] args) {
        case5 c = new case5();
        c.m1(10, 10.5f); // int-float version
        c.m1(10.5f, 10); // float-int version
        // --> c.m1(10, 10); Reference to m1 is ambigious
        // --> c.m1(10.5f, 10.5f); no suitable method found for m1()
    }
}
