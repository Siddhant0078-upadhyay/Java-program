import java.util.Scanner;
public class multiplicationtable {
    static int table(int x,int i){
            return x*i;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number =");
        int x=sc.nextInt();
        for(int i=1;i<=10;i++){
        System.out.printf("%d*%d=%d\n",x,i,table(x,i));
    }
    sc.close();
}
}
