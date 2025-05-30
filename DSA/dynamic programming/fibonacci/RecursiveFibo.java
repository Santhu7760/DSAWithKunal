package fibonacci;

public class RecursiveFibo {

    public static void main(String[] args) {
        System.out.println("the 50th fibonacci number is: "+fib(50));
    }

    public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
