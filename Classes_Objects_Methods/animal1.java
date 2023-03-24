class animal1
{
    public void eat()
    {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        System.out.println("1");
        animal1 buzo =new animal1();
        buzo.eat();
        buzo.run();
        
        System.out.println();

        animal1 tango =new animal1();
        tango.eat();
        tango.run();

        System.out.println();

        birds sparrow =new birds();
        sparrow.fly();
    } 

    public void run(){
        System.out.println("I am running");
    }

}

