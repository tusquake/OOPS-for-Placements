class thisdemo2 {
    void display()
    {
        System.out.println("hello");
    }
    void show()
    {
        this.display();
    }
    public static void main(String[] args) {
        thisdemo2 td=new thisdemo2();
        td.show();
    }
}
