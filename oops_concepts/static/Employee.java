class Employee {
    int emp_id;
    String name;
    static String company="Smart Programming";

    Employee(int emp_id,String name){
        this.emp_id=emp_id;
        this.name=name;
        // this.company=company;
    }

    void display(){
        System.out.println(emp_id+" "+name+" "+company);
    }
    public static void main(String[] args) {
        Employee e1=new Employee(101,"Amit");
        e1.display();
        Employee e2=new Employee(102,"Tussu");
        e2.display();
    }
}
