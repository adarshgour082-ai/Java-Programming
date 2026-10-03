public class pattern6{
    public static void main(String[] args){
        //Square pattern used to for loop

        for(int i = 0; i<5;i++){
            for(int j = 0;j <5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Square pattern\n");

        //Square pattern used to while loop

        int n = 5;
        int row = 0;
        while(row < n){
            int col = 0;
            while(col < n){
                System.out.print(" * ");
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
