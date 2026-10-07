public class SetMatrixZeros {
    public static void BruteForce(int[][] matrix , int n , int m){
        int temp[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                temp[i][j] = matrix[i][j];
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j]==0){
                    for(int k=0 ; k<n ; k++){
                        temp[i][k] = 0;
                    }
                    for(int k=0 ; k<m ; k++){
                            temp[k][j] = 0;
                    }
                }
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(temp[i][j] + " ") ;
            }
        }
        //TIME COMPLEXITY = O(N*M * 2N+M)
    }
    public static void Better(int[][] matrix , int n , int m){

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(row[i]==true || col[j]==true){
                    matrix[i][j] = 0 ;
                }
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(matrix[i][j] + " ") ;
            }
        }
    }
    public static void Optimal(int[][] matrix, int n , int m){
        boolean rowImpacted = false;
        boolean colImpacted = false;

        for(int col=0 ; col<m ; col++){
            if(matrix[0][col]==0){
                rowImpacted = true;
                break;
            }
        }
        for(int row=0 ; row<n ; row++){
            if(matrix[row][0]==0){
                colImpacted = true;
                break;
            }
        }
        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<m ; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(rowImpacted){
            for(int i=0 ; i<n ; i++){
                matrix[0][i] = 0 ;
            }
        }
        if(colImpacted){
            for(int j=0 ; j<m ; j++){
                matrix[j][0] = 0 ;
            }
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{1,1,1}
                        ,{0,1,1}
                        ,{1,1,1}};
        int n = matrix.length;
        int m = matrix[0].length;
        
        //BruteForce(matrix,n,m);
        Better(matrix,n,m);

        
    } 
}