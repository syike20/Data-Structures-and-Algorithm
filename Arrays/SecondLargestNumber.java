import java.util.Arrays;


public class SecondLargestNumber {
    public static void BruteForce(int[] arr , int n ){
        Arrays.sort(arr);
        for(int i=n-1 ; i>0 ; i--){
            if(arr[i]!=arr[n-1]){
                System.err.println("BruteForce : SecondLargest Element is " + arr[i]);
                return;
            }
        }
    } 
    public static void Better(int[] arr , int n ){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i=1 ; i<n ; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i]>slargest && arr[i]<largest){
                slargest = arr[i];
            }
        }
        System.err.println("Better : SecondLargest Element is " + slargest);
    }
    public static void Optimal(int[] arr , int n ){
        int largest = arr[0];
        int slargest = -1 ;
        for(int i=1 ; i<n ; i++){
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.err.println("Optimal : SecondLargest Element is " + slargest);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,7,5};
        int n = arr.length; 
        if(arr == null || n < 2 ){
            System.out.println("Arrays contains only 1 element.");
            return;
        }
        BruteForce(arr,n);
        Better(arr,n);
        Optimal(arr,n);


    }
    
}