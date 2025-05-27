import java.util.HashSet;
import java.util.TreeSet;

public class set {

    public static void main(String[] args) {
        
        HashSet<String> hset = new HashSet<>();
        hset.add("C");
        hset.add("B");
        hset.add("A");
        hset.add("C");
        System.out.println(hset);

        TreeSet<String> tset = new TreeSet<>();
        tset.add("C");
        tset.add("A");
        tset.add("B");
        tset.add("a");
        System.out.println(tset);

    
    }
}