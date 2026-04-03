import java.util.Scanner;
abstract class shape{
    abstract double[] func(double x,double y);
}
class square extends shape{
      double[] func(double x,double y){
      return new double[]{x*y, 2*(x+y)};
     }
    }
     class rectangle extends shape{
      double[] func(double x,double y){
       return new double[]{x*y, 2*(x+y)};
     }
}
public class Oopsconcept {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter S if you want to find area and perimeter of square or Enter R if you want to find area and perimeter of rectangle -");
    char a = sc.next().charAt(0);
    square s=new square();
    rectangle r= new rectangle();
    if(a=='S'){
        System.out.print("Enter the length of side=");
        int b =sc.nextInt();
        double res[] =s.func(b,b);
        System.out.println("Area of square=" + res[0]);
        System.out.println("Perimeter of square="+res[1]);
    }
    else{
        System.out.print("Enter the length of side=");
        int c =sc.nextInt();
        System.out.print("Enter the breadth of side=");
        int d=sc.nextInt();
        double res[] =r.func(c,d);
        System.out.println("Area of rectangle ="+res[0]);
        System.out.println("Perimeter of rectangle="+res[1]);
    }
    sc.close();
} 
}
    

