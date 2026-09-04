
public class Left_Rotate_Array_By_K {
    public static void BruteForce(int[] arr , int n , int d){
        d = d % n ;

        int[]temp = new int[d];
        for(int i=0 ; i<d ; i++){
            temp[i] = arr[i];
        }

        for(int i=d ; i<n ; i++){
            arr[i-d] = arr[i];
        }
        
        for(int i=n-d ; i<n ; i++){
            arr[i] = temp[i-(n-d)];
        }

        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Reverse(int[]arr , int left , int right  ){
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void Optimal(int[]arr , int n , int d ){
        Reverse(arr,0,d-1);
        Reverse(arr, d, n-1);
        Reverse(arr,0,n--1);
        for(int i=0 ; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        //output : 4,5,6,7,1,2,3
        Optimal(arr, n, d);

    }
    
}