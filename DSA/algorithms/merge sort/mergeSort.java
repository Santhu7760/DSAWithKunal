import java.util.Arrays;

/**
 * mergeSort
 */
public class mergeSort {

    static void divide(int arr[],int start,int end){
        if(start>end){
            return;
        }
        int mid=start+(end-start)/2;

        divide(arr, start,mid-1);
        divide(arr, mid+1, end);

        conquer(arr,start,mid,end);
    }

    static void conquer(int arr[],int start,int mid,int end){
        int newArr[]=new int[end-start+1];

        int idx1=start;
        int idx2=mid+1;

        int x=0;

        while (idx1<=mid&&idx2<=end) {
            if(arr[idx1]<arr[idx2]){
                newArr[x++]=arr[idx1++];
            }else{
                newArr[x++]=arr[idx2++];
            }
        }

        while (idx1<=mid) {
            newArr[x++]=arr[idx1++];
        }

        while (idx2<=end) {
            newArr[x++]=arr[idx2++];
        }

        for (int i = 0,j=start; i < newArr.length; i++) {
           arr[start++]=newArr[i]; 
        }
    }

    public static void main(String[] args) {
        int arr[]={1,4,3,6,5,8,2,9};

        divide(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}