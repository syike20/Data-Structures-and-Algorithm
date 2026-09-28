class LeaderInAnArray{

    public static void BruteForce(int arr[] , int n ){

        for(int i=0 ; i<n ; i++){
            boolean isLeader = true;

            for(int j=i ; j<n ; j++){
                if(arr[i]<arr[j]){
                    isLeader = false;
                }
            }
            if(isLeader){
                System.out.print(arr[i] + " ");
            }
        }
        
    }
    public static void Optimal(int[] arr , int n){
        int leader = arr[n-1] ;
        for(int i=n-1 ; i>=0 ; i--){
            
            if(arr[i]>=leader){
                leader = arr[i];
                System.out.print(leader + " ");
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {10,22,12,3,0,6};
        int n = arr.length;

        BruteForce(arr,n);
        System.out.println();
        Optimal(arr,n);
    }
}