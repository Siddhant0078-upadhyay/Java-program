class FindingGivenSum{
    public static boolean Findsum(int [] arr, int sum){
     int count =0,s=0;;
      for(int i =0;i<arr.length;i++){
        count +=arr[i];
        while(sum<count){
            count-=arr[s];
            s++;
        }
      if(sum==count)
        return true;
      }
        return false;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.print("Enter the size of the array = ");
      int n = sc.nextInt();
      System.out.print("Enter the value of sum = ");
      int sum =sc.nextInt();
      int [] arr = new int[n];
      System.out.println("Enter the element  of array : ");
      for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
      } 
      System.out.println( Findsum( arr, sum));
      sc.close();
    }
}