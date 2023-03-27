class thisdemo3 {
     thisdemo3(){
        System.out.println("no arg constructor");
     }   
     thisdemo3(int a){
        this();
        System.out.println("parameterized constructor");
     }
     public static void main(String[] args) {
        thisdemo3 td=new thisdemo3(10);
     }
}
