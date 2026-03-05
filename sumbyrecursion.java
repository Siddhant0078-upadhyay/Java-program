import java.util.Scanner;
public class sumbyrecursion {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
           return n+sum(n-1);
        }}
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number=");
            int n=sc.nextInt();
            System.out.printf("The sum of first %d natural number =%d",n,sum(n));
        }
    
    
}
