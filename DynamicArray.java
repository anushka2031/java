import java.util.ArrayList;
import java.util.Collections;

public class DynamicArray {

    public static void main(String[] args) {
        //ArrayList<String> arr = new ArrayList<>();
        // arr.add("rahul");
        // arr.add("rohit");
        // arr.add("mohit");
        // arr.add(0, "jain");
        // System.out.println(arr);
        // System.out.println(arr.get(2));
        // System.out.println(arr.size());
        // System.out.println(arr.getFirst());
        // System.out.println(arr.getLast());
        // arr.set(3, "ram");
        // System.out.println(arr);
        // arr.remove(0);
        // System.out.println(arr);
        
        // System.out.println(arr.reversed());

        // for (String str : arr) {
        //     System.out.println(str);
        // }

        // arr.add("b");
        // arr.add("A");
        // arr.add("e");
        // Collections.sort(arr);
        // System.out.println(arr);

        //Dynamic subarray sum
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(-7);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(-3);
        arr.add(0);
        arr.add(1);
        System.out.println(arr);
        System.out.println(arr.subList(0, 8));
        int sum=0;

        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        System.out.println(sum);

       int maxsum=0;
       

        for(int i=0;i<arr.size();i++){
            
            for(int j=i;j<arr.size();j++){
                arr.subList(i, j);
                System.out.println(arr.subList(i, j));
                
                int subsum=0;
                for(int k=i;k<j;k++){
                    subsum+=arr.get(k);
                    if(subsum>sum)
                    maxsum=subsum;
                    
                    
                }
                
                
                
                System.out.println(subsum);

                
            }
        }

        System.out.println("Maximum Subarray Sum is "+maxsum);
        
    }
    
}
