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

       try {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(-7);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(-3);
        arr.add(0);
        arr.add(1);
        
            
        int sum, max=arr.get(0), a=0;
        for(int i=0;i<(arr.size()-2); i++){
           
                sum=arr.get(i)+arr.get(i+1)+arr.get(i+2);
                if(sum>max){
                    max=sum;
                    a=i;
                }   
            }         
        
        System.out.println("the sum is: "+max);
         System.out.println("the subarray consists of elemnts "+arr.get(a)+" "+arr.get(a+1)+" "+arr.get(a+2));
       } catch (Exception e) {
        System.out.println("maximum subarray sum not found");
       }
     

    }
    
}
