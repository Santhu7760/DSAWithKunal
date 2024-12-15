/**
 * recursion
 */
public class recursion {
    // Printing numbers from 1 to 5
    public static void firstRecursion(int n){
        if (n==0){
            return;
        }System.out.println(n);
        firstRecursion(n-1);
        System.out.println(n);
    }

    // printing the sum of n natural numbers

    public static int secondRecursion(int n){
        if (n==5){
            return n;
        }
        return n+secondRecursion(n+1);
    }

    // printing the difference of n natural numbers 
    public static void thirdRecursion(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }s-=n;
        thirdRecursion(n-1, s);
    }


//    Printing factorial
    public static int fourthRecursion(int n){
        if(n==1){
            return 1;
        }int factorial=fourthRecursion(n-1);
        int product=n*factorial;
        return product;
    }


//    printing fibonacci
    public static int fifthRecursion(int n){
        if(n==1 || n==0){
            return n;
        }return fifthRecursion(n-1)+fifthRecursion(n-2);
    }


    //tower of hanoi
    public static void sixthRecursion(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        sixthRecursion(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        sixthRecursion(n-1,helper,src,dest);
    }

    public static void main(String[] args) {

//        sixthRecursion(3,"Source","helper","destination");
//        firstRecursion(5);
//        System.out.println(secondRecursion(0));
//        thirdRecursion(5,0);
//        System.out.println(fourthRecursion(5));
//        System.out.println(fifthRecursion(5));
        sixthRecursion(3,"source","helper","destination");
    }

}