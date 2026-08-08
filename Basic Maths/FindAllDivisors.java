public class FindAllDivisors {
    public static void main(String[] args) {
        int number = 2242;
        for(int i=1 ; i<=number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }
}
