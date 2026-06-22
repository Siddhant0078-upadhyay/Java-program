public class String_Pallindrome {
    public static boolean isPallindrome(String str,int start,int end) {
        if(start>=end){
            return true;
        }
        else
            return (str.charAt(start)==str.charAt(end)) && isPallindrome(str,start+1,end-1);
    }  
    public static void main(String[] args){
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int n=str.length();
        System.out.println(isPallindrome(str,0,n-1));
        sc.close();
    } 
}
