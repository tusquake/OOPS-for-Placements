public class B extends A{
    Object show(){
        System.out.println("2");
        return null;
    }
    public static void main(String[] args) {
        A t=new A();
        t.show();
        System.out.println("---------------");
        B ob=new B();
        ob.show();
    
    }
}
