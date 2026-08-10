class PalindromeNumber {

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
        int num = 2222;
        int reverseNum = revNum(num);
        if(num==reverseNum){
            System.out.println("Its a Palindrome Number !");
        }else{
            System.out.println("Its not a Palindrome Number !");
        }

    }
    //Time Complexity = O(logN)
    //Space Complexity = O(1)
}
