import java.util.HashSet;
class IntersectionOfTwoSortedArrays{

    public static void BruteForce(int[] num1 , int[] num2 , int n1 , int n2){
        for(int i=0 ; i<n1 ; i++){
            for(int j=0 ; j<n2 ; j++){
                if(num1[i]==num2[j]){
                    System.out.print(num1[i] +" ");
                    break;
                }
            }
        }
        //TIME COMPLEXITY = O(N^2);
        //SPACE COMPLEXITY = O(1);
    }
    public static void Better(int[] num1 , int[] num2 , int n1 , int n2 ){
        HashSet<Integer> set = new HashSet<>();
            for(int i=0 ; i<n1 ; i++){
                set.add(num1[i]);
            }
            for(int j=0 ; j<n2 ; j++){
                if(set.contains(num2[j])){
                    System.out.print(num2[j] + " ");
                    set.remove(num2[j]);
                }
            } 
    }
    public static void Optimal(int[] num1 , int[] num2 , int n1 , int n2 ){
        int i = 0 ;
        int j = 0 ;
        while( i<n1 &&  j<n2){
            if(num1[i]==num2[j]){
                System.out.print(num1[i] + " ");
                i++;
                j++;
            }else if(num1[i]<num2[j]){
                i++;
            }else{
                j++;
            }
        }
    }
    public static void main(String[] args){
        int num1[] = {1,2,2,3,5};
        int num2[] = {1,2,2,3,3,3};

        int n1 = num1.length; 
        int n2 = num2.length;

        BruteForce(num1,num2,n1,n2);
        System.out.println();
        Better(num1,num2,n1,n2);
        System.out.println();
        Optimal(num1,num2,n1,n2);

    }
} 