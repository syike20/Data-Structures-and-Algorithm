import java.util.HashMap;
public class Longest_Subarray_With_Sum_K_All{

    public static int Optimal(int[] arr , int n , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0 ;
        int sum = 0 ;

        for(int i=0 ; i<n ; i++){
            sum = sum + arr[i];

            if(sum==k){
                maxLength = i + 1 ; // 0 based indexing
            }
            if(map.containsKey(sum-k)){
                maxLength = Math.max(maxLength,i - map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;

    }
    public static int BruteForce(int[] arr , int n , int k ){
        int maxLength = 0 ;
        for(int i=0 ; i<n ; i++){
            int sum = 0 ;
            for(int j=i ; j<n ; j++){
                sum = sum + arr[j];

                if(sum==k){
                    maxLength =Math.max(maxLength , j - i + 1);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] nums = {1,-1,5,-2,3};
        int n = nums.length;
        int k = 3 ;
        System.out.println("Max Length : " + BruteForce(nums,n,k));
        System.out.println("Max Length : " + Optimal(nums,n,k));
    }
}
