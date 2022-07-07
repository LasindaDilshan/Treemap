import sun.awt.SunHints;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("Mango",1);
        map.put("Orange",1); // Values can be duplicate in the map
        map.put("Banana",1);
        map.put("Banana",2); // duplicate key will be overridden
        map.put(null,3);
       // map.put(null,6);
        System.out.println("Entity set : "+ map.entrySet());
        System.out.println("Key set : "+ map.keySet());
        System.out.println("Value set : "+ map.values());

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry pair = (Map.Entry)itr.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        for (Map.Entry<String,Integer> pair: map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        map.forEach((key,value)->System.out.println(key+ " " + value));


    }
}
