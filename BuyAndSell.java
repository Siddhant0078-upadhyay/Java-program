public class BuyAndSell {
    public static int maxProfit(int [] price,int n){
     int profit =0;
     for(int i=1;i<n;i++){
        if(price[i]>price[i-1])
            profit+=(price[i]-price[i-1]);
     }
     return profit;
    }
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n=sc.nextInt();
        System.out.println("Enter the prices of stock: ");
        int [] price = new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        System.out.println("Maximum profit = " +maxProfit(price, n));
        sc.close();
    }
    
}
