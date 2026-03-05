import java.util.Scanner;
public class fibonacci{
public static void main(String[] args){
    int i,a=0,b=1,c;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the limit =");
    int n = sc.nextInt();
    System.out.printf("%d,%d,",a,b);
    for(i=0;i<=n;i++){
    c=a+b;
    a=b;
    b=c;
    System.out.printf("%d,",c);
    }
    sc.close();
}
}