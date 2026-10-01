public class pattern1{
    public static void main(String[] args){
        int n =5;
        int space=0;
        int star = n, row =0;
        while(row < n){
            int i  = 0;
            while(i < space){
                System.out.print("   ");
                i++;
            }
            int j = 0;
            while(j < star){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            row++;
            space++;
            star--;
        }
    }
}
