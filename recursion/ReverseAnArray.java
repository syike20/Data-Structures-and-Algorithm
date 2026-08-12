public class ReverseAnArray {
    public static void reverseArray(int[] array,int l , int r ){
        if(l>=r){
            for(int i=0 ; i<array.length;i++){
                System.out.print(array[i]+" ");
            }
            return;
        }
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
        reverseArray(array, l+1, r-1);

    }
    public static void main(String[] args) {
        int[] array = {2,4,6,8,12,16,18,20};
        reverseArray(array,0,array.length-1);
    }
}
