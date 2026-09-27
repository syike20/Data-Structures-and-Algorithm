import java.util.HashMap;
public class MajorityElement_l {
    public static void BruteForce(int[] arr , int n){
        for(int i=0 ; i<n ; i++){
            int counter = 0 ;
            for(int j=0 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
                
            }
            if(counter>n/2){
                System.out.print(arr[i] + " " );
                break;
            }    
        }
        //TIME COMPLEXITY = O(N^2)
        //SPACE COMPLEXITY = O(1) 

    }
    public static void Better(int[] arr , int n ){
        HashMap<Integer,Integer> frequency = new HashMap<>();

        for(int element : arr){
            int updatedFrequency = frequency.getOrDefault(element,0)+1;
            frequency.put(element,updatedFrequency);
            if(updatedFrequency>n/2){
                System.out.print(element);
                break;
            }
        }
        //TIME COMPLEXITY = O(N)
        //SPACE COMPLEXITY = O(K) K IS DISTINCT ELEMENT INSIDE HASHMAP
    }
    public static void Optimal(int[] arr , int n ){
        int candidate = 0 ; 
        int counter = 0 ;

        for(int i=0 ; i<n ; i++){
            if(counter==0){
                candidate = arr[i];
            }
            if(arr[i]==candidate){
                counter++;
            }
            if(arr[i]!=candidate){
                counter--;
            }
        }
        System.out.print(candidate);
        //TIME COMPLEXITY = O(N)
        //SPACE COMPLEXITY = O(1)
    }
    public static void main(String[] args){
        int arr [] = {2,2,3,3,1,2,2};
        int n = arr.length;

        BruteForce(arr,n);
        System.out.println();
        Better(arr,n);
        System.out.println();
        Optimal(arr,n);
    }
}
