class A2 {
    A2()
    {
        System.out.println("i am in class A");
    }
}
class B extends A2
{
    B(){
    super();
        System.out.println("i am in class B");
    }

    public static void main(String[] args) {
        B ob=new B();
    }
}
