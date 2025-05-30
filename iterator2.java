import java.util.ArrayList;
import java.util.ListIterator;

public class iterator2 {
    
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("rohit");
        list.add("mohit");
        list.add("shanti");
        list.add("rohan");
        list.add("ram");

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String data=it.next();
            if(data.length() <= 3){
                data="bye";
            }
            System.out.println(data);
        }

        System.out.println("hurrah!!!!");
        int count=0;

        while (it.hasPrevious()) {
            String data=it.previous();
            count++;
            if(count != list.size()){
                data="hello";
                //it.set("hi");
            }
            System.out.println(data);
        }
        //System.out.println(list);

        String str="shanti";
        int count1=0;
        while (it.hasNext()) {
            String data=it.next();
            count1++;
            if(data == str){
                //break;
                System.out.println(count1-1);
            }
            
        }
       
    }
}
