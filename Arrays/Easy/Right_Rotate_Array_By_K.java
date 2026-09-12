class Right_Rotate_Array_By_K{
    public static void main(String[] args){
        int[] nums = {2,3,4,7,8};
        int n = nums.length;

        int k = 2 ;
        k = k % n ;
        
        for(int i=0 ; i<k ; i++){
            int last = nums[n-1];

            for(int j=n-1 ; j>0 ; j--){
                nums[j] = nums[j-1];
            }

            nums[0] = last;
        }

        for(int element : nums){
            System.out.print(element + " ");
        }


    }
}