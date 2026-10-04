public class pattern9{
    public static void main(String args[]){
        int n  = 7;
        int star = n/2;
        int space = 1;
        int row = 0;
        while(row < n){
            int i =0;
            while(i < star){
                System.out.print(" * ");
                i++;
            }
            int j = 0;
            while(j < space){
                System.out.print("   ");
                j++;
            }
            int k = 0;
            while(k < star){
                System.out.print(" * ");
                k++;
            }
            System.out.println();
            if(row < n/2){
                star--;
                space+= 2;
            }else{
                star++;
                space-=2;
            }
            row++;
        }
    }
}
