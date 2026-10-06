public class pattern17{
    public static void main(String[] args){
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;
        while(row <= n){
            int i = 1;
            while(i<=space){
                System.out.print("   ");
                i++;
            }
            int count = 1;
            int j = 1 ;
            while(j <= star){
                System.out.print(" "+count +" ");
                j++;
                count++;
            }
            System.out.println();
            space--;
            star += 2;
            row++;


        }
    }
}
