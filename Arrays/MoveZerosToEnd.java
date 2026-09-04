
public class MoveZerosToEnd {
    public static void BruteForce(int[] arr , int n){
        int temp[] = new int[n];
        int index = 0 ; 
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=0){
                temp[index] = arr[i];
                index++;      
            }
        }
        for(int i=0 ; i<n ; i++){
            arr[i] = temp[i];
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(temp[i]+" ");
        }

    }
    public static void Optimal(int[] arr , int n ){
        int j = -1 ; 
        for(int i=0 ; i<n ; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1 ; i<n ; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,0,2,3,0,4,0};
        int n = arr.length;

        BruteForce(arr, n);
        System.out.println();
        Optimal(arr, n);

    }
}
