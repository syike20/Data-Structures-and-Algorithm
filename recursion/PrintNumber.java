class PrintNumber{
    static int count=0 ;
    public static void printNum(){
        if(count==3){
            return;
        }
        count++;
        System.out.println(count);
        printNum();
    }
    public static void main(String[] args){
         
        printNum();
    }
}