import java.util.Scanner;
public class primenumber {
    public static void main(String[] args){
    int count,i=1,j;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the lower limit =");
     int a= sc.nextInt();
    System.out.print("\nEnter the upper limit =");
    int n = sc.nextInt();
    sc.close();
              for(i=a;i<=n;i++){
        count=0;
        for(j=1;j<=i/2;j++){
            if(i%j==0){
                count+=1;
            }
        }
        if(count==1){
            System.out.print(i+",");
        }
     }
          
    }
     }
    


    

