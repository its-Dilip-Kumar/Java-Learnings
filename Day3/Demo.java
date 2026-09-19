// in java there is a concept called call by value , not call by reference is not present in java,
//below is the example of call by value


class Demo2{
    int x;
    int y;
    Demo2(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class Demo {

    static void addTen(Demo2 r){
        r.x=r.x+10;
        r.y=r.y+10;
    }
    public static void main(String[] args){
        Demo2 r=new Demo2(4,5);
        System.out.println(r.x +","+r.y);
        addTen(r);
        System.out.println(r.x +","+r.y);
    }

}
