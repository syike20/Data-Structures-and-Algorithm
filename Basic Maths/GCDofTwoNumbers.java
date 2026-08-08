import java.util.Scanner;
public class GCDofTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int n1 = scanner.nextInt();
        System.out.println("Enter number 2 :");
        int n2 = scanner.nextInt();
        int max = Math.max(n1, n2);
        int gcd = 1 ;
        for(int i=1 ; i<max ; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i ;
            }
        }
        System.out.println("Greatest Common Divisor : " + gcd);

    }
}
