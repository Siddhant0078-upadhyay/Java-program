public class Tower_OF_Hanoi {
    public static void hanoi(int n,char A,char B,char C){
        if(n==1){
            System.out.println("Move 1 from " +A+ " to "+C);
        return;}
        hanoi(n-1,A,C,B);
        System.out.println("Move "+n+" from "+A+" to "+C);
        hanoi(n-1,B,A,C);
    }
   public static void main(String[] args){
char A='A';
char B='B';
char C='C';
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter the number of disc=");
    int n=sc.nextInt();
    hanoi(n,A,B,C);
    sc.close();
   }
}
