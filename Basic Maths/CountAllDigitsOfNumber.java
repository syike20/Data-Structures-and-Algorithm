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
    // Time Complexity = O(logN)
    // Because the program is constantly dividing the data.
    // Space Complexity = O(1)
    // Because its consist of constant amount of space being used.
}
