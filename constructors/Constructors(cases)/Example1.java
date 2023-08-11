public class Example1 {
    public static void m1() {
        m2();
    }

    public static void m2() {
        m1();
    }

    public static void main(String[] args) {
        m1(); // Runtime Error : Stack Overflow Error
        System.out.println("Hello");
    }
}
