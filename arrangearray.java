import java.util.Scanner;
public class arrangearray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      System.out.print("Enter the number=");
      int n =sc.nextInt();
      int i,temp,j,k;
      int []arr = new int[n];
      for(i=0;i<n;i++){
        System.out.print("Enter the element in  the array =");
         arr[i] = sc.nextInt();
      }
        for (i=0;i<n;i++){
          for(j=0;j<n;j++){
            if (arr[i]<arr[j]){
              temp=arr[j];
              arr[j]=arr[i];
              arr[i]=temp;
            }
          }
          
        }
        for(k=0;k<n;k++){
          System.out.println(arr[k]);
        }
            sc.close();
         } 
            }

