
public class recursion {
    
    static int basicRec(int n){
        if(n>=5  || n<0){
            return n;
        }
        return basicRec(n+1);
    }

    static int sumOfNumbers(int n){
        if(n<=0){
            if(n<0){
                System.out.println("Input natural numbers only!");
            }
            return 0;
        }
        return n+sumOfNumbers(n-1);
    }

    static int sumOfNumbers2(int n){
        if(n==0){
            return n;
        }
        return (n%10)+sumOfNumbers2(n/10);
    }

    static void numbers(int n){
        if(n<=0 || n>5){
            numberII(n);
            return;
        }
        System.out.println(n);
        numbers(n-1);
    }

    static void numberII(int n){
        if(n<0 || n>5){
            return;
        }
        System.out.println(n);
        numberII(n+1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        numbers(5);
    }

}