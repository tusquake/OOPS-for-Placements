public class case1 {

    public void m1(int i) {
        System.out.println("int-args version");
    }

    public void m1(float f) {
        System.out.println("float-args version");
    }

    public static void main(String[] args) {
        case1 c = new case1();
        c.m1(5); // int-args version
        c.m1(5.5f);// float-args version
        c.m1('a'); // int-args version (data type get promoted to next higher data type for char
                   // its int)
        c.m1(10l);// float-args version(data type get promoted to next higher data type for long
                  // its float)
        // c.m1(10.5); // -->CE (double does not have any higher data type)
    }

}