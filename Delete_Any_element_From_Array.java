public class Delete_Any_element_From_Array {
    public static int DeleteElement(int []arr,int x){
        int n = arr.length;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==x){
                break;
            }}
            if(i==n)
                return n;
        
        for(int j= i; j<n-1;j++){
         arr[j]=arr[j+1];
        }
       
        /*for(int k=0;k<n-1;k++){
            System.out.println(arr[k]);
           
        }*/
          return n-1;
      
    }
    public static void main(String[] args){
    java.util.Scanner sc =new java.util.Scanner(System.in);
    System.out.print("Enter the size of array =");
    int n =sc.nextInt();
    System.out.print("Enter the number you want delete =");
    int x =sc.nextInt();
    int []arr =new int[n];
    System.out.println("Enter the value of array:");
    for(int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("After deletion the array :");
   int size= DeleteElement( arr, x);
   for(int j=0;j<size;j++){
    System.out.println(arr[j]);
   }
    sc.close();
    }    
}
