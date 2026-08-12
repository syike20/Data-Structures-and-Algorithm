import java.util.Scanner;
public class SumOfFirstNnumber {
    static int sum =0;
    static int n = 0;
    public static  void   SumNumbers(int userInput){
        if(userInput==n){
            System.out.println(sum);
            return ;
        }
        n++;
        sum +=n;
        SumNumbers(userInput);
        
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();

        SumNumbers(number);
        scanner.close();
    }
    
}
