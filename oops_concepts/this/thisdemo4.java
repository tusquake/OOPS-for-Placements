class Test{
    Test(thisdemo4 td)
    {
        System.out.println("i am test class");
    }
}


class thisdemo4 {
    void m1()
    {
        Test t=new Test(this);
        System.out.println("i am m1 method");
    }
    // void m2()
    // {
    //     m1(this);
    //     System.out.println("i am m2 method");
    // }
    public static void main(String[] args) {
        thisdemo4 t=new thisdemo4();
        t.m1();
        // Test t=new Test(this);
    }
}
