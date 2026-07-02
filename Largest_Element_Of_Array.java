public class Largest_Element_Of_Array {
    public static int LargestElement(int[]arr){
       int max=0;
       int i;
       for(i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
       }
      return max;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Largest element=" +LargestElement(arr));
        sc.close();
    }
}
