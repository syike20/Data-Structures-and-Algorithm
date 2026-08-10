class demo{
    public static void main(String[] args){
        int number = 1543;
        int counter = 0 ;
        int sum = 0;
        int original = number ;
        while(number>0){
            counter++;
            number = number/10;

        }
        number  = original ;

        while(counter>0){
            int lastdigit = number % 10 ;
            sum += Math.pow(lastdigit,3);
            number = number / 10 ;
            counter--;
        }
        if(sum==original){
            System.out.println("True");
        }else{
            System.out.println("Nope");
        }
    }   
    
}