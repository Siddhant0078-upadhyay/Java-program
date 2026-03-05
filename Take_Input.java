import java.util.Scanner;

public class Take_Input {
    public static void main(String[] args) {
        System.out.println("Taking input of variable");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of numbers = " + sum);
        sc.close();
    }
}
    

