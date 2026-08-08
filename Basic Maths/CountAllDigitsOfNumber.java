class CountAllDigitsOfNumber {

    public static int countDigit(int n){
        int cnt = 0;
        while(n>0){
            cnt++;
            n = n / 10 ;
            
        }
        return cnt;
    }
    public static void main(String[] args){
        int num = 23142144;
        int digits = countDigit(num);
        System.out.println("Total number of Digits : " + digits);



    }
}
