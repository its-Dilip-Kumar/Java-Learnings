
class Student {
    String name;
    int age;
    int rollno;
    static String clg;

    Student(String name, int age, int rollno) {
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }

    //static block --> jitne bhi static variable hai yaha rkh do 
    static{
        clg="iit";
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya",21,50);
        Student s2 = new Student("Adi",1,5);

        // Student.clg="iit";  //age me ye nhi krna chahta to static block ka use kr skte hai 

        System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+Student.clg);
        System.out.println(s2.name+" "+s2.age+" "+s2.rollno+" "+Student.clg);
    }
}
