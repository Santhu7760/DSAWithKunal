package stairs;

public class Recursion {
    public static void main(String[] args) {
        System.out.format("the number of different steps to climb the %d stairs is: %d",4,stairs(4));
    }
    public static int stairs(int n){
        if(n==0 || n==1) return 1;

        return stairs(n-1)+stairs(n-2);
    }
}
