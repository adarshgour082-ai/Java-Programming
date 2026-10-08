public class Max_Min_Arrays{
    public static void main(String[] args){
        int arr[] = { 7,13,5,69,95};
        int max1 = arr[0];
        int min1 = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for(int i =1;i <arr.length;i++){
            if(arr[i] > max1){
                max1 = arr[i];
                maxIndex = i;
                // System.out.println(i);
            }
            if(arr[i] < min1){
                min1 = arr[i];
                minIndex = i;
            }
        }
  
        
        System.out.println("Max Element is =  " + max1);
        System.out.println("Max Index = " + maxIndex);
        System.out.println("Min Element is = " + min1);
        System.out.println("Min Index = " + minIndex);
    }
}
