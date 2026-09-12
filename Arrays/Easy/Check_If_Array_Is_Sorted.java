import java.util.Scanner;

public class Check_If_Array_Is_Sorted {

    public static void BruteForce(int[] arr, int n){
        boolean isSorted = true ;
       for(int i=0 ; i<n ;i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[j]<arr[i]){
                    isSorted = false;
                }
            }
       }
       if(isSorted==true){
        System.out.println("Sorted ");
       }
       else{
        System.out.println("Not Sorted");
       }


    }

    public static void Optimal(int[]arr , int n ){
        boolean isSorted = true;
        for(int i=n-1 ; i>0 ; i--){
            if(arr[i]<arr[i-1]){
                isSorted = false ;
                break;
            }
        }
        System.out.println(isSorted);
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