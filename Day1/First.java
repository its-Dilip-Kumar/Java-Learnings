class Student{
    String name;
    int age;
    Student(String n, int a){ //parametrized constructor
        name=n;
        age=a;
    }
    Student(){
        //default constructor
    }
}

public class First {
    public static void main(String[] args){
        Student s1=new Student("Ram",21);
        Student s2=new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
