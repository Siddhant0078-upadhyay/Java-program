public class SlidingWindowTechnique {
    public static int maxSum(int [] arr , int n,int k){
      int count =0 , res=0 ;
      for(int i=0;i<k;i++)
        count+=arr[i];
    for(int i=0;i<k; i++){
        count = count +arr[i+k]-arr[i-k];
        res=Math.max(res,count);
    }
    return res;
    
    }
    public static void main(String[] args){
        java.util.Scanner ob = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n =ob.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number o  f consecutive elemnt to be sum=");
        int k =ob.nextInt();
        System.out.println("Enter the element of array :");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println(maxSum(arr,n,k));
        ob.close();
    }
    
}
