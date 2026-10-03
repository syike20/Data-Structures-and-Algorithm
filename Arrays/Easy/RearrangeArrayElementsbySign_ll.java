import java.util.ArrayList;
class RearrangeArrayElementsbySign_ll{
    public static void main(String[] args){
        int arr[]={1, -2, 3, -4, 5, -8, 6, 7};
        int size = arr.length;

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int k=0 ; k<size ; k++){
            if(arr[k]>0){
                positive.add(arr[k]);
            }else{
                negative.add(arr[k]);
            }
        }

        int result[] = new int[size];

        int i = 0 ; 
        int p = 0 ;
        int n = 0 ; 

        while(p<positive.size() && n<negative.size()){
            result[i++] = positive.get(p++);
            result[i++] = negative.get(n++);
        }
        while(p<positive.size()){
            result[i++] = positive.get(p++);
        }
        while(n<negative.size()){
            result[i++] = negative.get(n++);
        }

        for(int j=0 ; j<size ; j++){
            System.out.print(arr[j] + " ");
        }
    }
}