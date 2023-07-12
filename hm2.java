import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("India","A");
        tm.put("China", "a");
        tm.put("US", "Ma");
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(tm);
        System.out.println(hm);
    }
}
