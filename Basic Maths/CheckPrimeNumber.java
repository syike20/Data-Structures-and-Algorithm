public class CheckPrimeNumber {
    public static void main(String[] args){
        int n = 49 ;
        int cnt = 0 ;
            for(int i=1 ; i<n ; i++){
                if(n%i==0){
                    cnt++;
                }

            
        }
        if(cnt == 2){
                System.out.println("Its an Prime Number");
            }else{
                System.out.println("Its not an Prime Number");
            }
    
    }
}
