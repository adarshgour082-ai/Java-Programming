public class Continues_binary_problem{
    public static void main(String[] args){
        int count= 0;
        int max = 0;
        int arr[] = {0,1,0,1,1,1,0,0,1,1,1,1,1,1,1,0,1};
        for(int i = 0;i <arr.length;i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(count,max);
            }else{
                count = 0;
            }
        }
        System.out.println(max);
    }

}
