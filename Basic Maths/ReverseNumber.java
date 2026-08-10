class ReverseNumber {

    public static int revNum(int n){
        int reverseNum = 0;
        while(n>0){
            int lastdigit = n % 10 ; 
            reverseNum = reverseNum * 10 + lastdigit;
            n = n / 10 ;
        }
        return reverseNum;
        
    }
    public static void main(String[] args){
        int num = 5423;
        int reverseNum = revNum(num);
        System.out.println("Reversed Number : " + reverseNum);


    }
    //Time Complexity = O(logN)
    //Space Complexity = O(1)
}
