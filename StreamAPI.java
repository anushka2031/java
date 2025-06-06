
import java.util.stream.*;
import java.util.*;


public class StreamAPI {

    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(55,10,15,20,25);

        // List <Integer> evenlist = list.stream()
        //                               //.filter(n -> n%2 ==0)
        //                               .map(n -> n+5)
        //                               .collect(Collectors.toList());
        //  System.out.println(evenlist);

        // int sum = list.stream().reduce(10,(a,b) -> a+b);
        // System.out.println(sum);

        int max = list.stream().reduce(0, (a,b) -> a>b?a:b);
        System.out.println(max);
        List <Integer> newlist = list.stream()
                                      .filter(a -> a!=max)
                                      .collect(Collectors.toList());

        int max2 =  newlist.stream().reduce(0, (a,b) -> a>b?a:b);
        System.out.println(max2);
    }
    
}
