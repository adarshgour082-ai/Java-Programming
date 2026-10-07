public class pattern20{
    public static void main(String[] args){
        int n =7;
        int space= n-1;
        int star = 1, row =0;
        int num = 1;
        while(row < n){
            int i  = 0;
            while(i < space){
                System.out.print(" 1 ");
                i++;
            }
            int j = 0;
            
            while(j < star){
                System.out.print(" "+num+" ");
                j++;
            }
            num++;
            System.out.println();
            row++;
            space--;
            star++;
        }
    }
}
