public class FrequenciesOfArray {
    public static void Freq(int []arr,int n){
        int i=0;
        int j;
        int freq=1;
        while(i<n){
            boolean visited = false;
            for(int k=0;k<i;k++){
                if(arr[k]==arr[i]){
                    visited = true;
                    break;
                }
            }
            if(visited == true){
                i++;
                continue;
            }
            
            for(j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println("Frequency of "+arr[i]+"= "+freq);
            //if(arr[i]!=arr[i+1])
            i++;
            freq=1;
        }
        //if(n==1||arr[n-2]!=arr[n-1]){
          //  System.out.println("Frequency of"+arr[n-1] +"= 1");
       // }
    }
    public static void main(String[] args){
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n=sc.nextInt();
        System.out.println("Enter the value of each element of array :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Frequency of each element of array :");
        Freq(arr,n);
    }
    
}
