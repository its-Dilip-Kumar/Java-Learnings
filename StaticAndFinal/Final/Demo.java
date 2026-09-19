public class Demo {
    public static void main(String[] args){
        Random r=new Random();
        System.out.println(r.PI);
    }
}

class Random{
    final double PI;
    Random(){
        this.PI=3.14; 
    }
}
