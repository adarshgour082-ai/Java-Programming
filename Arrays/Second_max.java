public class Second_max{
    public static void main(String[] args){
        int arr[] = { 10,20,3,0,40,100,0,90};
        int max = Math.max(arr[0],arr[1]);
        int smax = Math.min(arr[0],arr[1]);
        for(int i =2;i < arr.length;i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > smax){
                smax = arr[i];
            }
        }
        System.out.println("Max element is  = " + max);
        System.out.println("Second Max element is  = " + smax);

    }
}
