public class Longest_Subarray_With_Sum_K_Positives {
    public static void main(String args[]){
        int arr[] = {1, 2, 1, 1, 3};
        int k = 4;
        int n = arr.length;
        int sum = 0;
        int maxLength = 0;

        int left = 0;
        
        for(int right=0 ; right<n ; right++){
            sum = sum + arr[right];
            while(sum>k){
                sum = sum - arr[left];
                left++;
            }
            if(sum==k){
                maxLength = Math.max(maxLength,right - left + 1 );
            }
        }
        System.out.print("Longest Subarray with Sum K : " + maxLength);
    }
}
