public class pattern4{
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int star = 1;
        int space = n-1;

        while (row < 2 * n - 1) {
            int j = 0;
            while (j < space) {
                System.out.print("   ");
                j++;
            }
            int i = 0;
            while (i < star) {
                System.out.print(" * ");
                i++;
            }

            System.out.println();
            row++;
            if(row < n){
                star++;
                space--;

            }
            else {
                star--;
                space++;
            }
        }
    }
}
