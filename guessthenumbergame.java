import java.util.Scanner;
import java.util.Random;
class game{
    private int num;
    Random obj = new Random();
    public game(){
        num = obj.nextInt(100);
    } 
    public int getnum(){
        return num;
    }
}
public class guessthenumbergame {
    public static void main(String[] args) {
    int i=1;
    System.out.println("You have to guess the number only in 10 guess");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number=");
        int n =sc.nextInt();
    game sid= new game();
    while((n<sid.getnum()||n>sid.getnum())&&i<=10){
    if (n>sid.getnum()){
        System.out.println(n+" is greater than number");
        System.out.print("Enter the number=");
        n =sc.nextInt();
    }
    else{
        System.out.println(n+" is less than number");
        System.out.print("Enter the number=");
         n =sc.nextInt();
    }
        i =i+1;
    }
    if(i>10){
        System.out.println("You Lost!!");
        System.out.println("The number you have to guess="+sid.getnum());
    }
    else{
        System.out.println("You Won!!");
        System.out.println("The number you have to guess="+sid.getnum());
    }
    sc.close();
    }
}
