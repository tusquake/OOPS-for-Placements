class Student {
    String name;
    int rollno;

    Student() {
        name = "Tussu";
        rollno = 69;
    }

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    Student(Student s) {
        this.name = s.name;
        this.rollno = s.rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Mussu", 21);
        Student s3 = new Student(s1);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println("_____________________________\n");
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println("_____________________________\n");
        System.out.println(s3.name);
        System.out.println(s3.rollno);
    }

}

// Inheritance concept not applicable for constructors