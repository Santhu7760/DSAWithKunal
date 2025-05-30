package fibonacci;

import java.util.Scanner;

public class Tabulation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");

        int n=scanner.nextInt();

        int arr[]=new int[n+1];

        arr[0]=0; arr[1]=1;

        System.out.format("the fibonacci of the number %d is: %d",n,fib(arr));
    }
    public static int fib(int arr[]){
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[arr.length-1];
    }
}
