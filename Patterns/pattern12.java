public class pattern12{
    public static void main(String[] args){
        int n = 5 ;
        int  row = 0;
        int star = 1 ;
        int space = n+2;
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
            if(row == n-1){
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
            star++;
            space -= 2;
        }

    }
}
