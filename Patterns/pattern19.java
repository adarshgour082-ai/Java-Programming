public class pattern19{
    public static void main(String[] args){
        int n = 10;
        int star = 1;
        int space = n-1;
        int row =0;
        int num = 10;
        while(row < n){
            int i = 0;
            while(i < space){
                System.out.print("   ");
                i++;
            }
            int j =  0;
            while(j < star){
                if(num == n){
                    System.out.print(" 0 ");
                }else{

                    System.out.print(" "+num+" ");
                }

                if(j < star/2){
                    num++;
                }else{
                    num--;
                }
                j++;
            }
            System.out.println();
            space--;
            star+=2;
            row++;

        }
    }
}
