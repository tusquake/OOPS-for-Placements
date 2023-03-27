class A1 {
    void m1()
    {
        System.out.println("i am in class A1");
    }
}
class B extends A1{
    void m1(){
        System.out.println("i am in class B");
    }

    void show()
    {
        m1();
        super.m1();
    }
    public static void main(String[] args) {
        B ob=new B();
        ob.show();
    }
}
