import java.util.ArrayList;
import java.util.Arrays;

public class arrayRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1,1,1,1,2,5,6,7,6,5,5,4,43,3,23};

        ArrayList<Integer> newArr=new ArrayList<>();

       ArrayList<Integer> result=removingDuplicatesOfArray(arr,0,newArr);

       result.sort(null);
        System.out.println(result);
    }

    static int sumOfArrayElements(int[] arr,int idx,int sum){
        if(idx==arr.length){
            return sum;
        }
        sum+=arr[idx];
        return sumOfArrayElements(arr,idx+1,sum);
    }

    //below function returns non duplicate value of an array.
    //only works when all numbers are repeats evenly except any one number of an array
    static int duplicate(int[] arr,int idx,int unique){
        if(idx==arr.length){
            return unique;
        }
        unique^=arr[idx];
        return duplicate(arr,idx+1,unique);
    }

    static ArrayList<Integer> removingDuplicatesOfArray(int[] arr,int idx,ArrayList<Integer> newArr){
        if(idx==arr.length){
            return newArr;
        }
        if (!newArr.contains(arr[idx])) {
            newArr.add(arr[idx]);
        }

        return removingDuplicatesOfArray(arr, idx + 1, newArr);
    }



}
