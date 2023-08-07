public class case4 {
    public void m1(int i) {
        System.out.println("General method");
    }

    public void m1(int... i) {
        System.out.println("Var-args method");
    }

    public static void main(String[] args) {
        case4 c = new case4();
        c.m1(); // var-args method
        c.m1(10, 20); // var-args
        c.m1(3);// General Method
    }

}

// 1--> // General type method came in java 1.0 version but Var-args type method
// came in
// java 1.2 Version
// so when there this collision between this general method will get the change
// beacuse in java priroity is given to old methods

// 2 --> // Var-args type method get least priority it is just like default
// method
// in switch case