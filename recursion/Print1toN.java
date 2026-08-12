 import java.util.Scanner;


 class Print1toN{
    static int count = 0 ;
    public static void printNumbers(int n){
        if(count==n){
            return;
        }
        count++;
        System.out.println(count);
        printNumbers(n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        printNumbers(n);
        scanner.close();

    }
}
