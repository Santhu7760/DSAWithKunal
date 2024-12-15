import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr=new int[]{1,7,4,2};
        System.out.println(Arrays.toString(arr));
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr){
        for (int  i = 0; i < arr.length; i++) {
            int max=arr.length-i-1;

            int maxIdx=getMaxIdx(arr,0,max);

            int temp=arr[maxIdx];
            arr[maxIdx]=arr[max];
            arr[max]=temp;
        }
    }

    private static int getMaxIdx(int[] arr, int start, int end) {
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
       
    }
}
