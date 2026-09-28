// arr = {3,1,-2,-5,2,-4};
import java.util.ArrayList;


class RearrangeArrayElementsBySign_l{
    public static void BruteForce(int[] arr , int n){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            if(arr[i]>=0){
                positive.add(arr[i]);
            }else{
                negative.add(arr[i]);
            }
        }

        int index = 0 ;
        for(int i=0 ; i<positive.size() ; i++){
            arr[index++] = positive.get(i);
            arr[index++] = negative.get(i);
        }

        for(int i=0 ; i<n ;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void Optimal(int arr[] , int n ){
        int positiveIndex = 0; 
        int negativeIndex = 1;
        int[] ans = new int[n];
        for(int i=0 ; i<n ; i++){
            if(arr[i]>=0){
                ans[positiveIndex] = arr[i];
                positiveIndex += 2;
            }
            else{
                ans[negativeIndex] = arr[i];
                negativeIndex += 2;
            }
        }
        for(int i=0 ; i<n ;i++){
            System.out.println(ans[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr1= {3,1,-2,-5,2,-4};
        int n = arr1.length;

        BruteForce(arr1,n);
        System.out.println();
        int[] arr2= {3,1,-2,-5,2,-4};
        Optimal(arr2,n);
    }
}