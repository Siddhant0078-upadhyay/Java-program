import java.util.Scanner;
public class fibonaccibyrecurrsion {
     static int fib(int x){
        if(x==1){
            return 0;
        }
        else if(x==2){
            return 1;
        }
            else{
                return fib(x-1)+fib(x-2);
            }
        
     }
    public static void main(String[] args){
        System.out.print("Enter the limit =");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.print("\nThe Fibonacci series is \n");
        for(int i=1;i<=n;i++){
            System.out.print(+fib(i));
            System.out.print(",");

        }
        sc.close();
    }
}
