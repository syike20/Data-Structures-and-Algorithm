import java.util.Scanner;
public class LinearSearch {

    public static void Linear_Search(int[] arr , int n , int element){
        for(int i=0 ; i<n ; i++){
            if(arr[i]==element){
                System.out.println(element + " found on index "+i);
                return;
            }
        }
        System.out.println("Element not Found .");
        
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array  : ");
        int n = sc.nextInt();
        System.out.println("Enter Elements in Array : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }    
        System.out.println("Enter Element to Search : ");
        int element = sc.nextInt();
        Linear_Search(arr,n,element);
    }   
}
