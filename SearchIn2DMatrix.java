 class SearchIn2DMatrix{
    public boolean searchMatrix(int[][] matrix, int target) {
      int m=matrix.length;
      int i = 0;
      int row;
        int n= matrix[i].length;
         int col;
        int low =0, high = m*n-1;
        while(low<=high ){
            int mid=(low+high)/2;
             row=mid/n;
              col=mid%n;
            if(matrix[row][col]==target)
            return true;
            else if(matrix[row][col]<target)
             low =mid+1;
            else{
            high=mid-1;
        }
      }  
      return false;
    }
}