import java.util.Arrays;

/**
 * bubleSort
 */
public class bubleSort {

    public static void main(String[] args) {
        int[] arr=new int[]{3,5,3,2,1,2,6,7,8};
        System.out.println(Arrays.toString(arr));
        buble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void buble(int[] arr){
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }if(!flag){
                break;
            }
        }
    }
}