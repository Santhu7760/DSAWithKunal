package fibonacci;

import java.util.Scanner;

public class TabulationComplexityReduction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number: ");

        int n=scanner.nextInt();

        int prev2=0;
        int prev1=1;

        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }

        System.out.println("the "+n+"th fibonacci number is: "+prev1);
    }
}
