public class pattern13{
    public static void main(String[] args){
        int n = 5 ;
        int  row = 0;
        int star = 5 ;
        int space = -1;
        while(row<n){
            int i =0;
            while(i <star){
                System.out.print(" * ");
                i++;
            }
            int j = 0;
            while(j <space){
                System.out.print("   ");
                j++;
            }
            if(row == 0){
                int k = 1;
                while(k < star){
                    System.out.print(" * ");
                    k++;
                }
            }else{
                int k =0;
                while(k <star){
                    System.out.print(" * ");
                    k++;
                }
            }
            System.out.println();
            row++;
            star--;
            space += 2;
        }

    }
}
