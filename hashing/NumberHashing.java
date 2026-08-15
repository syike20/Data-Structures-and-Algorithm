import java.util.Scanner;
class NumberHashing{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter elements in the array : ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        //prefetch
        int[] hash = new int[n+1];
        for(int i=0 ; i<hash.length ; i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Enter number to know frequency : ");
        int q = scanner.nextInt();
        while(q-- != 0 ){
            int number = scanner.nextInt();
            System.out.println(hash[number]);
        }
        scanner.close();
    }
}