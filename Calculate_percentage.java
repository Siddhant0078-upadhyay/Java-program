import java.util.Scanner;
public class Calculate_percentage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained in maths=");
        float m =sc.nextFloat();
         System.out.print("Enter marks obtained in physics=");
         float p = sc.nextFloat();
         System.out.print("Enter marks obtained in chemistry=");
         float c =sc.nextFloat();
         System.out.print("Enter marks obtained in hindi=");
         float h = sc.nextFloat();
         System.out.print("Enter marks obtained in english=");
         float e =sc.nextFloat();
        double per=(e+h+m+c+p)*0.2;
        System.out.println("the percentage obtained by student=" + per);
        sc.close();
    }

}