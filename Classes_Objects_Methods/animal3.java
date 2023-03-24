public class animal3 {
    String color;
    int age;

    void initObj(String c,int a){
        color=c;
        age=a;
    }

    void display(){
        System.out.println(color+" "+age);
    }

    public static void main(String[] args) {
        animal3 dogo = new animal3();
        dogo.initObj("brown", 20);
        dogo.display();

    }
}
