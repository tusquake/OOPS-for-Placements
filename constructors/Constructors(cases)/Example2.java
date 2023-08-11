public class Example2 {
    Example2() {
        this(10);
    }

    Example2(int i) {
        // this(); --> // Compile time error recursive constructor invocation
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
