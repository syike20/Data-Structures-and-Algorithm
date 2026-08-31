
public class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,7,5};
       int largest = arr[0];
       int n = arr.length;
       for(int i=1 ; i<n ; i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
       }
       int secondLargest = -1 ;
       for(int i=0 ; i<n ; i++){
        if(arr[i]>secondLargest && arr[i]<largest){
            secondLargest = arr[i];

         }
       }

       System.out.println(secondLargest);
    }
    
}