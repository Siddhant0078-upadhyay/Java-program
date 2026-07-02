public class Josephus_Problem {
    public static int Josephus(int n, int k){
        if(n==1)
            return 0;
        else
            return (Josephus(n-1, k)+k)%n;
    }  
    public static void main (String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of man =");
        int n =sc.nextInt();
        System.out.print("Enter the value of k =");
        int k=sc.nextInt();
        System.out.println(Josephus(n, k));
        sc.close();
    }  
}
