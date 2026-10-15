public class subArray{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int count = 0;
        for(int start = 0; start<arr.length;start++){
            for(int end = start; end<arr.length;end++){
                for(int i = start; i<=end;i++){
                    System.out.print(arr[i] + " ");
                }
                count++;
            System.out.println();
            }
        }
        System.out.println("Total number of SubArrays : " + count);
    }
}

