class Student{
    String name;
    int age;
    int rollno;
    String college;
    Student(){
        this("unknown");
    }
    Student(String name){
        this(name,0);
        System.out.println("I am demo constructor");
    }
    Student(String name,int age){
        this(name,age,0);
        System.out.println("I am first constructor");
    }
    Student(String name,int age,int rollno){
        this(name,age,rollno,"unknown");
        System.out.println("I am second constructor");
    }
    Student(String name,int age,int rollno,String college){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.college=college;
        System.out.println("I am third constructor");
    }

}

public class Demo {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("Aditya");
        Student s3=new Student("Aditya",21);
        Student s4=new Student("Aditya",21,25);
        Student s5=new Student("Aditya",21,25,"iitg");

        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.rollno);
        // System.out.println(s1.college);

    }
}
