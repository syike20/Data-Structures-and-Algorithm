import java.util.Scanner;
public class Factorial {
    

    public static void factorialOfN(int n,int count ,long  factorial){
    if(n==0){
        System.out.println(1);
        return;

    }
    else if(n==count){
    System.out.println(factorial);
    return;
    }
    count++;
    factorial = factorial * count;
    factorialOfN(n, count, factorial);

    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Number : ");
            int number = scanner.nextInt();
             int count = 0;
             long  factorial = 1;
            
            
            factorialOfN(number,count,factorial);
        }
        
    }


}

