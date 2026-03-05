
public class varargs {
    static int sum(int ...arr){
       int sum=0;
       for(int a:arr){
        sum+=a;
       }
       return sum;
    }
    public static void main(String[] args){
        System.out.println("Sum of 67,88,89=" + sum(67,88,89));
    }
    
}
