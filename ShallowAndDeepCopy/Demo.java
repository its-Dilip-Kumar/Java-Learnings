public class Demo{
    static void addTen(Copy r){
        r.x=r.x+10;
        r.y=r.y+10;
    }
    public static class Copy{
        int x;
        int y;
        Copy(int x,int y){
            this.x=x;
            this.y=y;
        }
        Copy(Copy r){
            this.x=r.x;
            this.y=r.y;
        }
    }
    public static void main(String[] args){
        Copy r1=new Copy(4,5);
        Copy r2=new Copy(r1); //deep copy --> completely new copy banana
        // Copy r3=r1;           //shallow copy ---> same copy ko hi point karna

        System.out.println(r1.x+","+r1.y);
        addTen(r1);
        System.out.println(r1.x+","+r1.y);

    }
}