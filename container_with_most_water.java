    import java.util.Scanner;
    public class container_with_most_water {
    public static int maxArea(int[] height) {
        int maxwater = 0;
        int i, j;
        for (i=0;i<height.length; i++) {
            for (j = i + 1; j < height.length; j++) {
                int w = j - i;
                int h = Math.min(height[i], height[j]);
                int area = w * h;
                maxwater =Math.max(maxwater, area);
            }
        }
        return maxwater;
    }

    public static void main (String[] args){
     Scanner sid = new Scanner(System.in);
     System.out.print("Enter the number of height=");
     int i;
     int n=sid.nextInt();
     int []height =new int[n];
     for(i=0;i<n;i++){
        System.out.print("Enter the value of height["+i+"]=");
        height[i]=sid.nextInt();
     }
     System.out.println("The amount of water filled is "+maxArea(height));
     sid.close();
    }
}

