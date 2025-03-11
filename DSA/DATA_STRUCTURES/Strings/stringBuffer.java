public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);     
        
        sb.replace(6, 11, "Hava");
        System.out.println(sb);

        sb.delete(6, 10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);    
        
        sb.setCharAt(1, 'a');
        System.out.println(sb);
    }
}
