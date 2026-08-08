import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ogNumber = number;
        int k = String.valueOf(number).length();
        int sum = 0 ;
        int lastdigit = 0;
        while(number>0){
            lastdigit = number % 10 ; 
            sum += (int) Math.pow(lastdigit, k)  ;
            number = number / 10;
            
        }
        if(sum==ogNumber){
            System.out.println("Its an Armstrong Number!");
        }
        else{
            System.out.println("Its not an Armstrong Number!");
        }
        scanner.close();
    }
}
