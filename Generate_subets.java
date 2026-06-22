public class Generate_subets {
    public static void subset(String str,String curr,int i){
        if(i>=str.length()){
            System.out.println(curr);
            return;
        }
        subset(str,curr,i+1);
        subset(str, curr+str.charAt(i),i+1);
    }
    public static void main(String[] args){
        String curr = "";
        int i=0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the string: ");
        String str =sc.nextLine();
        System.out.println("Subsets of given string:");
        subset(str,curr,i); 
        sc.close();
    }
}
