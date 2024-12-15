public class basic_understanding {
    public static void main(String[] args) {
        first(5);
    }
    static void first(int n){
         second(n*1);
    }

    static void second(int n){
         third(n-1);
    }

    static void third(int n){
         fourth(n/1);
    }

    static void fourth(int n){
         fifth(n+1);
    }

    static void fifth(int n){
        return;
    }

}
