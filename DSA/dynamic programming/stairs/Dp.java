package stairs;

import java.util.Arrays;

public class Dp {
    public static void main(String[] args) {
        int n=3;
        int arr[]=new int[n+1];

        Arrays.fill(arr,-1);

        System.out.println(steps(n,arr));
    }
    public static int steps(int n,int arr[]){
        if(n==0 || n==1) return 1;

        if(arr[n]!=-1) return arr[n];

        return arr[n]=steps(n-1,arr)+steps(n-2,arr);
    }
}
