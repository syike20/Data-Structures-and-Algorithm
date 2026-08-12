public class PalindromeOfString {
public static void Palindrome(String str ,int l , int r ){
        
        if(l>=r){
            System.out.println("Palindrome");
            return ;
        }
        else if(str.charAt(l)!=str.charAt(r)){
            System.out.println("Not a Palindrome");
            return ;
        }
        
        Palindrome(str, l+1, r-1);

    }
    public static void main(String[] args) {
        String str = "madam";
        Palindrome(str,0,str.length()-1);
    }
}
