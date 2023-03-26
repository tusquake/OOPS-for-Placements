class A {
    void showA(){
        System.out.println("A class method");
    }
}

class B extends A{
    void showB()
    {
        System.out.println("B class method");
    }
    
}

class C extends B{
    void showC(){
        System.out.println("C class method");
    }
    public static void main(String[] args) {
        A ob1=new A();
        ob1.showA();
        // ob1.showB();
        // ob1.showC();
        System.out.println("---------------------");
        B ob2=new B();
        ob2.showA();
        ob2.showB();
        // ob2.showC();
        System.out.println("---------------------");
        C ob3=new C();
        ob2.showA();
        ob2.showB();
        ob3.showC();
    }
}

