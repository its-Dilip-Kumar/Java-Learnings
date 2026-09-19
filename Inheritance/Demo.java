public class Demo {
    public static void main(String[] args){
        EngineeringStudent es=new EngineeringStudent();
        es.markAttendance();
        Student s=new Student();
    }
}

class Student{
    String name;
    int age;
    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student{
    void attendlab(){
        System.out.println("lab attended");
    }
}



/*Inheritance are of four types 
1-simple 
2-multilevel
3-Hierachial
4-Multiple Inheritance */