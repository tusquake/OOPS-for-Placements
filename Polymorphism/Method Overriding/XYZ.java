class XYZ extends Test1
{
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.show();
        System.out.println("-------------");

        XYZ x=new XYZ();
        x.show();
    }
}
