public class printEven{
    public static void printEvenNumber(int num){
        if(num == 0 ){
            return;
        }
        if(num % 2== 0){
            System.out.print(num + " ");
        }
        printEvenNumber(num-1);
    }
    public static void main(String[] args){
        printEvenNumber(10);
    }
}