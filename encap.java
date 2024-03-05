import java.util.*;
import java.io.*;
class Pp{
    private double x; private double y;
    //ecanpsulation
    int setres(int a, int b) //method overloading (same parameters)
    {
        this.x =a;
        this.y=b;
        return (int)(this.x+this.y);

    }
    double setres(double x,double y){
        this.x = x;
        this.y = y;
        return 0;
    }
    double getres(){
        return this.x+this.y;
    }
}
class Mmm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Pp pp= new Pp();
        int res = pp.setres(a,b);
        System.out.println(res);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        pp.setres(x,y);
        System.out.println(pp.getres());
    }
}