import java.util.HashSet;

public class Remove_Duplicates_From_Sorted_Arrays {
    public static void BruteForce(int[] arr){
        HashSet <Integer> set = new HashSet<>();
        int index = 0;
        for(int element : arr){
            if(!set.contains(element)){
                set.add(element);
                arr[index] = element;
                index++;
            }
        }
        System.out.println("Array after removing elements : ");
        for(int i=0 ; i<index ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Optimal(int[] arr,int n){
        int i = 0 ;
        for(int j= 1 ; j<n ; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int k=0 ; k < i+1 ; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int n = arr.length;
        BruteForce(arr);
        Optimal(arr,n);
    
    }
}