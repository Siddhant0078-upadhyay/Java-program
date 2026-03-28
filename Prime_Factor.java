import java.util.Scanner;
public class Prime_Factor {
    public static void main(String[] args) {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number =");
    int n =sc.nextInt();
    while(n%2==0){
        System.out.print(2+"*");
        n=n/2;
    }
     while(n%3==0){
        System.out.print(2+"*");
        n=n/3;
    }
    for(i=5;i*i<=n;i=i+6){
        while(n%i==0){
        System.out.print(i+"*");
        n=n/i;
    }
    while(n%(i+2)==0){
        System.out.print(i+2+"*");
        n=n/(i+2);

    }
}
  if(n>3){System.out.print(n);}
  sc.close();
    }
}