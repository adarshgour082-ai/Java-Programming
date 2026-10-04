public class pattern10{
    public static void main(String args[]){
        int n  = 7;
        int star = n/2;
        int space = -1;
        int row = 0;
        while(row < n){
            int i =0;
            while(i < star + 1){
                System.out.print(" * ");
                i++;
            }
            int j = 0;
            while(j < space){
                System.out.print("   ");
                j++;
            }
            if(row == 0 || row == n-1){
                    int k = 1;
                    while(k <= star){
                
                        System.out.print(" * ");
                        k++;
                    }
            }
            else{ 
                    int k = 0;
                    while(k <= star){
                
                        System.out.print(" * ");
                        k++;
                 
                 
                    }
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
