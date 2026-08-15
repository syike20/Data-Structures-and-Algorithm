import java.util.Scanner;
class CharacterHashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] hash = new int[26];

        for(int i=0 ; i<str.length(); i++){
            hash[str.charAt(i) - 'a'  ] ++  ;
        }

        int q = sc.nextInt();
        while(q-- > 0){
            char  ch  = sc.next().charAt(0);
            System.out.println(hash[ch - 'a']);
        }
    }
}