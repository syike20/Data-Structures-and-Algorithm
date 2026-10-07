import java.util.Arrays;
class RotateImage{
    public static int[][] BruteForce(int matrix[][] , int n ){
        int rotated[][] = new int[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                rotated[j][n-1-i] = matrix[i][j]; //reverse the row index so it becomes a column index from the opposite side.
            }
        }
        return rotated;
    }
    public static int[][] Optimal(int matrix[][] , int n ){
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){ //i+1 because we dont want to include diagonal elements 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0 ; i<n ; i++){
            int left = 0 ;
            int right = n -1 ; 

            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3}
                        , {4, 5, 6}, 
                          {7, 8, 9}};
        int n = matrix.length;
        
        System.out.print(Arrays.deepToString(Optimal(matrix , n)));
    }
}