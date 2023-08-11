class Example {
    Example(double d) {
        this(10);
        System.out.println("Double-Args Constructor");
    }

    Example(int i) {
        this();
        System.out.println("Int-Args Constructor");
    }

    Example() {
        System.out.println("No-Args Constructor");
    }

    public static void main(String[] args) {
        Example e = new Example(10.5);
        System.out.println("____________________");
        Example e1 = new Example(10);
        System.out.println("____________________");
        Example e2 = new Example();

    }

}
