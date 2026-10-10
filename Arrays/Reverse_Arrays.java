import java.util.*;
public class Reverse_Arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a No. of Element : ");
        n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter Elements : ");
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + "  ");
        }

        sc.close();
        
    }
}