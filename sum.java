import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number=");
        int n =sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2==0){
                sum = sum+i;
            }
            i=i+1;
        }
        System.out.print("\n");
        System.out.println("the sum of even number ="+sum);
        sc.close();
    }
    
}
