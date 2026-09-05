class MaximumConsecutiveOnes{

    public static void Optimal(int[] arr, int n ){
        int cnt = 0;
        int max = 0;

        for(int i=0 ; i<n ;i++){
            if(arr[i]==1){
                cnt ++;
                if(max<cnt){
                    max = cnt ;
                }
            }
            else{
                cnt = 0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int arr[]= {1,1,0,1,1,1,0,1,1};
        int n = arr.length;
        Optimal(arr,n);
        }
}