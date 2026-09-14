import java.util.HashMap;
class Subarray_Sum_Equals_K{
    public static void main(String[] args){
        int [] nums =  {1,2,3};
        int k  = 3 ;
        
        int sum = 0;
        int result = 0;

        HashMap<Integer,Integer> mp = new HashMap<>();

        mp.put(0,1);

        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];

            if(mp.containsKey(sum-k)){
                result += mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        System.out.print(result);
        
    }
}