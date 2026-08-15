class FreqOfEachElementBF{
    public static void main(String[] args){
        int[] arr = {10,5,15,10,5,10};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for(int i=0 ; i<n ; i++){
            if(visited[i]){
                continue;
            }
            int count = 1 ;
            for(int j=i+1 ; j<n; j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + ":" + count );

        }

    }
}