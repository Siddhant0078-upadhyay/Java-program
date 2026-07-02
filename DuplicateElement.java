public class DuplicateElement {
    public static int DuplicateEle(int [] arr){
        int res=1;
        int i;
        int n=arr.length;
        System.out.println(arr[0]);
        for(i=0;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                System.out.println(arr[res]);
                res++;
            }
        }
        System.out.print("Number of elements after removal of duplicates element = ");
        return res;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array =");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array in sorted way : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After the deletion of element :");
        System.out.println(DuplicateEle( arr));
        sc.close();
    }
}
