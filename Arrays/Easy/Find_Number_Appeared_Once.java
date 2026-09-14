    import java.util.HashMap;
    import java.util.Map;

    class Find_Number_Appeared_Once{
        public static void BruteForce(int[] arr , int n ){
            for(int i=0 ; i<n ; i++){
                int count = 0 ;
                for(int j=0 ; j<n ;j++){
                    if(arr[j]==arr[i]){
                        count++;
                    }
                }
                if(count==1){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
        public static void Better(int[] arr , int n){
            //Find Max number First to get the size of Hash
            int maxElement = arr[0];
            for(int i=0 ; i<n ; i++){
                if(maxElement<arr[i]){
                    maxElement = arr[i];
                }
            }
        
            int[] hash = new int[maxElement + 1 ];
            for(int i=0 ; i<n ; i++){
                hash[arr[i]]++;
            }
            
            for(int i=0 ; i<=maxElement ; i++){
                if(hash[i]==1){
                    System.out.println(i);
                    return;
                }
            }
        }
        public static void BetterOFBetter(int[]arr , int n){
            HashMap <Integer,Integer> map = new HashMap<>();
            for(int element : arr){
                map.put(element,map.getOrDefault(element,0)+1);
            }
            for (int element : arr) {
                if (map.get(element) == 1) {
                    System.out.println(element);
                }
            }
        }
        public static void Optimal(int[] arr , int n ){
            int XOR = 0;
            for(int element : arr){
                XOR = XOR ^ element ; 

            }
            System.out.println(XOR);
        }
        public static void main(String[] args) {
            int arr[] = {4,1,2,1,2};
            int n = arr.length;
            BruteForce(arr,n);
            Better(arr, n);
            BetterOFBetter(arr, n);
            Optimal(arr, n);
        }
    }