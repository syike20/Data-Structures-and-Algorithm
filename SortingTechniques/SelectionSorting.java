import java.util.Scanner;

class SelectionSorting{
    public static void SelectionSort(int[] arr ,int n){
    for(int i=0 ; i<n ; i++){
        int min = i ; 
        for(int j=i+1 ; j<n ; j++){
            if(arr[j]<arr[min]){
                min = arr[j] ;
            }
        }
        int temp = arr[min];
        min = arr[i];
        arr[i] = temp;

    }
    for(int num : arr ){
        System.out.println(num+" ");
    }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int n = arr.length;
        System.out.print("Enter Elements : ");
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr,arr.length);

    }
}