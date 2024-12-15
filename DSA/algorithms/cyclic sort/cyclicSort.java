import java.util.Arrays;

public class cyclicSort {

    static void cycle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int t = arr[i] - 1;

            if (arr[i] != arr[t]) {

                int temp = arr[i];
                arr[i] = arr[t];
                arr[t] = temp;

            }
        }
    }

    static int missingNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            int t = arr[i];

            if (arr[i]<arr.length && arr[i] != arr[t]) {

                int temp = arr[i];
                arr[i] = arr[t];
                arr[t] = temp;

            }
        }

        return missing(arr);
    }

    static int missing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        // cycle(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }
}
