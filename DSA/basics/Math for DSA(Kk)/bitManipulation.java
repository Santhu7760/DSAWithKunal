public class bitManipulation {

    public static String evenOrOdd(int n) {
        return (n & 1) == 0 ? "Even" : "Odd";
    }


    //this program only works good when the array contains only one unique value.
    public static int uniqueNumberInAnArray(int[] arr){
        int unique=0;

        for (int i : arr) {
            unique^=i;
        }
        return unique;
    }

    public static boolean powerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        // System.out.println(evenOrOdd(2025));
        // int[] arr={-1,3,2,4,3,2,-1};
        // System.out.println(uniqueNumberInAnArray(arr));
        System.out.println(powerOfTwo(27));

        
    }
}