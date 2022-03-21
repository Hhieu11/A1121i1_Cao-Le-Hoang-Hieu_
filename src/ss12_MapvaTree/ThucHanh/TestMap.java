package ss12_MapvaTree.ThucHanh;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("Smith",30);
        map.put("Hieu",31);
        map.put("Jonh",35);
        map.put("Kevin",33);

        System.out.println("Display Map");
        System.out.println(map);


        Map<String, Integer>treeMap=new TreeMap<>(map);
        System.out.println("tang dan ");
        System.out.println(treeMap);

        Map<String,Integer>treeMap2=new TreeMap<>(Collections.reverseOrder());
        treeMap2.putAll(treeMap);
        System.out.println("giam gian");
        System.out.println(treeMap2);

        Map<String,Integer>linkedhashMap= new LinkedHashMap<>(16,0.75f,true);
        linkedhashMap.put("Smith",30);
        linkedhashMap.put("Hieu",31);

        linkedhashMap.put("Jonh",35);
        linkedhashMap.put("Kevin",33);
        System.out.println("\nThe age for " + "Hieu is " + linkedhashMap.get("Hieu"));

    }


}
