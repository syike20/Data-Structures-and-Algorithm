import java.util.Arrays;
import java.util.Scanner;

class LargestElement{


    public static void   BruteForce(int[] arr){
        int[] temp = arr.clone();
        Arrays.sort(temp);
        System.out.println( temp[temp.length-1]);
    }

    public static void Optimal(int n ,int[] arr){
        
        int max = arr[0] ;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[max]<=arr[i]){
                max = arr[i];
            }

        }
        
        System.out.println(arr[max]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        Optimal(n,arr);
        BruteForce(arr);
       sc.close();
    }
}
