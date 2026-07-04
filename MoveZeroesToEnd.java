public class MoveZeroesToEnd {
    public static void MoveZeroes(int[] arr,int n){
        int count =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }
    public static void main (String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the value of element of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         MoveZeroes(arr, n);
         System.out.println("After the moving of zeroes to end, the array :");
for(int j=0;j<n;j++){
    System.out.println(arr[j]);
}
sc.close();
    }
    
}
