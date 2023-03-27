class thisdemo6 {
    thisdemo6 m1(){
        return this;
    }
    public static void main(String[] args) {
        thisdemo6 t=new thisdemo6();
        t.m1();
    }
}
