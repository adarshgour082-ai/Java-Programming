public class pattern7{
    public static void main(String[] args){
        //using for loop
        for(int i = 0; i <= 5;i++){
            for(int j = 0;j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Triangle :- \n");
        // using while loop
        int star = 1;
        int row = 0 , n = 5;
        while(row < n){
            int col = 0;
            while(col < star){
                System.out.print(" * ");
                col++;
            }
            System.out.println();
            row++;
            star++;
        }
       
    }
}
