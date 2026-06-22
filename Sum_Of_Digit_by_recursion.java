public class Sum_Of_Digit_by_recursion {
    public static int sum(int n){
        if(n==0)
            return 0;
        else
            return sum(n/10)+n%10;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        System.out.println("The sum of digit of number ="+sum(n));
        sc.close();
    }
    
}
