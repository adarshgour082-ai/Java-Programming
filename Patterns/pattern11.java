public class pattern11{
    public static void main(String args[]){
        int n = 7;
        int star = 1;
        int space = n/2;
        int row = 0;
        while(row < n){
            int i =0;
            while(i < space){
                System.out.print(" ");
                i++;

            }
            int j = 0;
            while(j < star){
                if(j == 0 || j == star-1)
                {
                  System.out.print("*"); 
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            if(row < n/2){
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }
            row++;
        }
    }
}
