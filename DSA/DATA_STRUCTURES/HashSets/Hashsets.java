import java.util.HashSet;
import java.util.Iterator;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> sets=new HashSet<>();

        sets.add(10);
        sets.add(20);
        sets.add(30);
        sets.add(40);

        System.out.println(sets);

        System.out.println("does the set contains 20: "+sets.contains(20));

        System.out.println("does the set contains 50: "+sets.contains(50));

        System.out.println("size of the set: "+sets.size());

        sets.remove(10);
        System.out.println(sets);

        Iterator<Integer> it=sets.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("is the set empty: "+sets.isEmpty() );
    }
}