/**
 * patterns
 */
public class patterns {
    public static void firstPattern(){
        int n=5;
        // Upper Half
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ^ ");
                if(i==n){
                    System.out.print(("        ") +("<-- KOTLIN LOGO"));
                }
            }
            System.out.println();
        }

        // Lower HAlf
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ^ ");
            }
            System.out.println();
        }
    }


    public static void secondPattern(){
        int iTurns=7;
        // Upper Half
        for(int i=1;i<=iTurns;i++){
            for(int j=1;j<=i;j++){
                if((i%2==1 && j%2==0)||(i%2==0 && j%2==1)){
                    System.out.print("   ");
                } else {
                    System.out.print(" -> ");
                }
            }System.out.println();
        }

        // Lower Half 
        for(int i=1;i<=iTurns-1;i++){
            for(int j=iTurns-i;j>=1;j--){
                if((i%2==0 && j%2==0)||(i%2==1 && j%2==0)){
                    System.out.print("   ");
                }else{
                    System.out.print(" -> ");
                }
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        firstPattern();
        secondPattern();
    }
}