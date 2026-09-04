import java.util.HashSet;

public class UnionOfSortedArrays {

    public static void BruteForce(int arr1[] , int arr2[] , int m , int n ){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0 ; i<m ; i++){
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }
        for(int i=0 ; i<n ; i++){
            if(!set.contains(arr2[i])){
                set.add(arr2[i]);
            }
        }
        int union[] = new int[set.size()];
        int i = 0 ;
        for(int element : set){
            union[i] = element;
            i++;
        }

        for(int j=0 ; j<union.length ; j++){
            System.out.print(union[j] +" ");
        }

    }
public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5} ;
    int arr2[] = {2,3,4,4,5} ;
    int m= arr1.length;
    int n = arr2.length;

    BruteForce(arr1,arr2,m,n);
    
}   
    
}