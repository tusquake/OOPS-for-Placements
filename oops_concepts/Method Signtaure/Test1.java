public class Test1 {
    public int m1(int i) {
        return i;
    }

    public String m1(String s) {
        return s;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.m1(5));
        System.out.println(t.m1("Tussu"));
        // --> t.m1(10.5); // no suitable method found for m1(double)

    }
}