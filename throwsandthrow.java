import java.util.Scanner;
class RadiusNegativeException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative" ;
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative" ;}
    }

public class throwsandthrow  {
    public static double area(double r) throws RadiusNegativeException {
        if(r<0){
            throw new RadiusNegativeException();
        }
         return Math.PI*r*r;
    }
    public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter the radius=");
        double r =sc.nextDouble();
        try{
            System.out.println(area(r));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
        

    
}
