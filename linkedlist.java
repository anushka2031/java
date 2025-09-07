import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        long start = System.nanoTime();
        ll.add(5);
        System.out.println(ll.contains(5));
        long end = System.nanoTime();
        System.out.println(end-start);

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);

    }
}