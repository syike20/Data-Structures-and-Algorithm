import java.util.Arrays;
public class SecondSmallestNumber {
    public static void BruteForce(int[]arr , int n ){
        Arrays.sort(arr); // 0 1 2 3 4 7 7 
        for(int i=0 ; i<n ; i++){
            if(arr[0]!=arr[i]){
                System.out.println("BruteForce : Second Smallest Element : " + arr[i]);
                return;
            }
        }
    }
    public static void Better(int[]arr , int n ){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i]<secondSmallest && arr[i]>smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Better : Second Smallest Element : " + secondSmallest);
    }
    public static void Optimal(int[] arr , int n ){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]>smallest){
                secondSmallest = arr[i];
            }

        }
        System.out.println("Optimal : Second Smallest Element : " + secondSmallest);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,7,0}; 
        int n = arr.length;
        BruteForce(arr,n);      
        Better(arr, n); 
        Optimal(arr, n);
    }
}