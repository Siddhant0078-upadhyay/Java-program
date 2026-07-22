public class RainwaterTrappingProblem {
    public static int Maxwater(int []arr, int n){
        int start =0;
        int end =n-1;
       int totalwater=0;
        int lmax=arr[0] , rmax=arr[n-1];
        while(start < end){
            if(lmax > rmax){
           totalwater+=rmax-arr[end];
           end--;
           if(end>=0) rmax=Math.max(rmax,arr[end]);
            }
            else{
                totalwater +=lmax-arr[start];
                start++;
                if(start<n) lmax=Math.max(lmax,arr[start]);
            }
        }
        return totalwater;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ente the size of array = ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Total amount of water trapped = "+ Maxwater(arr, n) );
        sc.close();
    }
    
}
