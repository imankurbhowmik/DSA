import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Integer num = 876383457;
        String name = "Ankur";

        int a = num.hashCode();
        int b = name.hashCode();

        System.out.println(a+" "+b);

        HashMap<String, Integer> map = new HashMap<>();
//        TreeMap<String, Integer> map2 =  new TreeMap<>();  // in order

        MapUsingHash map3 = new MapUsingHash();

        map3.put("Mango", "King of fruits");
        map3.put("Apple", "A sweet red fruit");
        map3.put("Pomegranate","Ankur's fav");


        System.out.println(map3.get("Pomegranate"));

        map.put("Ankur", 98);
        map.put("Madhur", 88);
        map.put("Murli", 78);
        map.put("Virli", 28);

        System.out.println(map.remove("Murli"));
        System.out.println(map.getOrDefault("Ankit", 89));
        System.out.println(map.containsKey("Virli"));

        HashSet<Integer> set = new HashSet<>();

        set.add(90);
        set.add(10);
        set.add(70);
        set.add(80);
//        set.add(90);
        set.add(30);

        System.out.println(set);

        KarpRabinAlgorithm algo = new KarpRabinAlgorithm();
        algo.search("Arjun", "KunalRahulArjun");
    }
}