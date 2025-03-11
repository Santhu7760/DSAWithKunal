import java.util.Arrays;

public class BuiltInArray {
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};

        System.out.println("Contents of array: "+Arrays.toString(arr));

        System.out.println("length of the array: "+arr.length);

        arr[0]=20;
        arr[1]=10;
        arr[3]=50;
        arr[4]=40;
        System.out.println("modified array: "+Arrays.toString(arr));


        Arrays.sort(arr);
        System.out.println("sorted array: "+Arrays.toString(arr));

    }
}
