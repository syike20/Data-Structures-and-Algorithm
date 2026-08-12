import java.util.Scanner;
public class FibonacciNumber {
    public static int  Fibonacci(int n){
        if(n<=1){
            return n;
        }
        int last = Fibonacci(n-1);
        int slast = Fibonacci(n-2);
        return last + slast ;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
        scanner.close();
    }
}
