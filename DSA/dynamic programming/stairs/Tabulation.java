package stairs;

import java.util.Arrays;

public class Tabulation {
    public static void main(String[] args) {
        int n=5;
        int arr[]=new int[n+1];

        Arrays.fill(arr,-1);

        arr[0]=1;
        arr[1]=1;

        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        System.out.println(arr[n]);
    }
}
