import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("rohit");
        list.add("mohit");
        list.add("shanti");
        list.add("rohan");
        list.add("ram");
        //System.out.println(list);

        // Iterator<String> it = list.iterator();
        // System.out.println(it.hasNext());
        // while(it.hasNext()){
        //     String data = it.next();
        //     if(data.startsWith("r")){
        //         it.remove();
        //     }
        //     System.out.println(data);
        // }
        // System.out.println(list);

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
        }
        System.out.println("Dhoom Machale!!!!");
        while (it.hasPrevious()) {
            String PrevData = it.previous();
            System.out.println(PrevData);
        }

    }
}