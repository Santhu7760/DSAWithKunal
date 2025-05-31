package stairs;

public class TabulationCR {
    public static void main(String[] args) {
        int n=6;
        int step0=1;
        int step1=1;

        for(int i=2;i<=n;i++){
            int curr=step1+step0;
            step0=step1;
            step1=curr;
        }
        System.out.println(step1);
    }
}
