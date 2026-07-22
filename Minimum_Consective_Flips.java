public class Minimum_Consective_Flips {
    public static void printgroups(int arr[] ,int n){
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    System.out.print("From "+ i+ " to ");
                }
                else
                    System.out.println(i-1);
            }
        }
        if(arr[n-1]!=arr[0]){
            System.out.println(n-1);
        }

    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n =sc.nextInt();
        System.out.println("Enter the element of arr : ");
        int arr[] =new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        printgroups(arr,n);
        sc.close();
    }
    
}
