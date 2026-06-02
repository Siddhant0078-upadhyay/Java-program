import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString() + "  I am toString";
    }
    @Override
    public String getMessage(){
        return super.getMessage() + "   I am get message";
    }}
    public class MyException1 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of a=");
            int a =sc.nextInt();
            if(a<12){
                try{
                    throw new MyException();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println((e.toString()));
                }
            }
           sc.close();
        }

    }
