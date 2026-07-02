public class Subset_Sum_Problem {
    public static int count(int [] arr,int sum, int n){
        if(n==0)
            return (sum==0)?1:0;
        return count(arr, sum, n-1) + count(arr, sum-arr[n-1],n-1);

    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of sum =");
        int sum =sc.nextInt();
        System.out.println(count(arr,sum,n));
        sc.close();
    }
    
}
