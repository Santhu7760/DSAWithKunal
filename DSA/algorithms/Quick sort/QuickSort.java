import java.util.Arrays;

public class QuickSort {

    static void sort(int arr[], int start, int end) {
        if (start < end) {

            int pivot = partition(arr, start, end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    static int partition(int arr[], int start, int end) {
        int pivot=arr[end];
        int x=start-1;

        for (int i = start; i < end; i++) {
            if(arr[i]<pivot){
                x++;
                int t=arr[x];
                arr[x]=arr[i];
                arr[i]=t;
            }
        }
        x++;
        int t=arr[x];
        arr[x]=arr[end];
        arr[end]=t;

        return x;

    }

    public static void main(String[] args) {
        int arr[]={2,5,4,6,8,7,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
