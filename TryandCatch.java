public class TryandCatch {
    public static void main(String[] args){
        int [] marks =new int[4];
        marks[0]=95;
        marks[1]=85;
        marks[2]=9;
        marks[3]=50;
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.print("Enter the index of array that have to divide:"); 
        int a=sc.nextInt();
        System.out.print("Enter the number which divide the number:");
        int b= sc.nextInt();
        try{
            System.out.println("The number that have to divide:"+marks[a]);
            System.out.println("The number which divide the number:"+b);
            System.out.println("The result ="+marks[a]/b);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds error occured");
            System.out.println(e);
        }
         catch(ArithmeticException e){
            System.out.println("Some Arthmetic error occured");
         System.out.println(e);
    }
     catch(Exception e){
            System.out.println("Some other error occured");
            System.out.println(e);
}
     sc.close();
    }}
