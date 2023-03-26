public class Test {
    void show()
    {
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.show(1);
    }
}
