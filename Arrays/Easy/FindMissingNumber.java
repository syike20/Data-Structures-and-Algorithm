public class FindMissingNumber {

    public static void BruteForce(int[] arr){
        int n = arr.length + 1 ; // because length + 1 because one element is missing.
        for(int i=1 ; i<=n ; i++){
            boolean found = false;

            for(int j=0 ; j<n-1 ; j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Missing Element is "+ i );
            }
        } 
        return ;
        
    }
    public static void Better(int[] arr){
        int n = arr.length + 1 ;
        int[] hash = new int[n+1];
        for(int i=0 ; i<n-1 ;i++){
            hash[arr[i]]++;
        }
        for(int i=1 ; i<=n ;i++){
            if(hash[i]==0){
                System.out.println("Missing Element is " + i);
                return ;
            }
        }
        }
    public static void Optimal(int[] arr){
        int n = arr.length + 1 ;
        long sum = 0 ;
        for(int i=0 ; i<n-1;i++){
            sum += arr[i];
        }
        long expSum = n * (n+1) / 2 ;

        long missingElement = expSum - sum ;

        System.out.println("Missing Element is " + missingElement);
    }
        public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};  
        BruteForce(arr);
        Better(arr);
        Optimal(arr);

    }
}
