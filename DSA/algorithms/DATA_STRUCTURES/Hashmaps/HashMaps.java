import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("hello","hello".length());
        map.put("world", "world".length());
        map.put("java", "java".length());
        map.put("python", "python".length());

        System.out.println(map);

        System.out.println(map.containsKey("python"));

        System.out.println(map.get("python"));

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        Set<String> keyset=map.keySet();
        System.out.println(keyset);

        keyset.remove("python");
        System.out.println(keyset);

        map.remove("java");
        System.out.println(map);
    }
}