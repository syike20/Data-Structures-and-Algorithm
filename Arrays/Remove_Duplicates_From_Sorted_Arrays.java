import java.util.Scanner;
public class Remove_Duplicates_From_Sorted_Arrays {

    public static void BruteForce(int[]arr ,int n){
        for(int i=0 ; i<n ;i++){
            for(int j=1 ; j<n ; j++){
                if(arr[j]==arr[i]){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        BruteForce(arr,n);
    }
}
