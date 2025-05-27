import java.util.HashMap;

public class hashmap {

   public static void main(String[] args) {
    
    //  HashMap<String , Integer> map = new HashMap<>();
    //  map.put("id0", 1);
    //  map.put("id1", 2);
    //  map.put("id2", 3);
    //  System.out.println(map);
    //  System.out.println(map.get("id0"));
    //  System.out.println(map.containsKey("id0"));
    //  System.out.println(map.containsValue(2));
    //  map.remove("id2");
    //  System.out.println(map);

    //  for (String key : map.keySet()) {
    //     System.out.println(key);
    //  }

    HashMap<Integer , Integer> map =new HashMap<>();
    map.put(1, 12);
    map.put(2, 13);
    map.put(3, 14);
    for (int key : map.keySet()) {
        System.out.println(key);
    }

    map.forEach((key,value) -> {
        // if(key>2){
        // System.out.println(key + " " + value);
        // }

        if(value.equals(13)){
            System.out.println(value);
        }
    });


   }
    
}
