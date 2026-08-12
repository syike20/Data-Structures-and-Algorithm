 import java.util.Scanner;

 class PrintNto1{
    static int sum = 0 ;
    public static void printNumbers(int n){
        if(n==1){
            return;
        }
        n--;
        System.out.println(n);
        printNumbers(n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        printNumbers(n);
        scanner.close();

    }
}
