public class pattern8{
    public static void main(String[] args){
       

        // using while loop
        int star = 5;
        int row = 0 , n = 5;
        while(row < n){
            int col = 0;
            while(col < star){
                System.out.print(" * ");
                col++;
            }
            System.out.println();
            row++;
            star--;
        }
       
    }
}
