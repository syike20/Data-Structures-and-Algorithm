import java.util.ArrayList;
class SpiralTraversalOfAMatrix{

    public static void Solution(int[][] arr , int n , int m){
        ArrayList <Integer> matrix = new ArrayList<>();

        int top = 0 ; 
        int bottom = n - 1;
        int left = 0 ;
        int right = m - 1;

        while(top<=bottom && left<=right){
            for(int i=left ; i<=right ; i++){
                matrix.add(arr[top][i]);
            }
            top++;
            for(int i=top ; i<=bottom ; i++){
                matrix.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right ; i>=left ; i--){
                    matrix.add(arr[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom ; i>=top ; i--){
                    matrix.add(arr[i][left]);
                }
            }
            left++;
        }
        System.out.println(matrix);
    }
    public static void main(String[] args){
        int arr[][] = {{1 , 2 , 3 , 4 , 5},
                       {6 , 7 , 8 , 9 , 10},
                       {11, 12, 13, 14, 15},
                       {16, 17, 18, 19, 20}};
        int n = arr.length; //rows
        int m = arr[0].length; //columns
        Solution(arr,n,m);
    }
}