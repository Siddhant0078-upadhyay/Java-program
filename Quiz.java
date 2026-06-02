import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        arr [0]=2;
        arr[1]=6;
        arr[2]=0;
        arr[3]=4;
        arr[4]=8;
       boolean flag= true;
       while(flag){
        System.out.print("Enter the index of array=" );
        int n =sc.nextInt();
        try{
           
        try{
            System.out.println("The value of entered index of array = "+arr[n]);
            flag = false;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Entered index is out of bound ");
        }}
        catch(Exception e){
            System.out.println("Any other Exception");
        }

    }
    sc.close();
} 
}
