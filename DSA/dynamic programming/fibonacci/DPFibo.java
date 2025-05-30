package fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class DPFibo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");

        int n=scanner.nextInt();

        int arr[]=new int[n+1];

        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }

        System.out.println("array before dp: "+ Arrays.toString(arr));
        System.out.format("the %dth fibonacci number is: %d",n,fib(n,arr));
        System.out.println("\narray after performing dp: "+Arrays.toString(arr));
    }

    public static int fib(int n,int arr[]){
        if(n<=1) return n;

        if(arr[n]!=-1) return arr[n];

        return arr[n]=fib(n-1,arr)+fib(n-2,arr);
    }
}
