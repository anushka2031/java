import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIques {

    public static void ques1(){

        List <Integer> list = Arrays.asList(1,2,3,4,5);

        List <Integer> evenlist = list.stream()
                                      .filter(n -> n%2 ==0)
                                      .map(n -> n*n)
                                      .collect(Collectors.toList());
        System.out.println(evenlist);
    }

    public static void ques2() {

        List <String> list = Arrays.asList("Ram","Shyam","Om","Sita");

        List <String> newlist = list.stream()
                                    .filter(n -> n.length()>3)
                                    .map(n -> n.toUpperCase())
                                    .collect(Collectors.toList());
        System.out.println(newlist); 
    }

    public static void ques3(){

        List <Integer> list = Arrays.asList(1,2,3,4,5);
        List <Integer> newlist = list.stream()
                                     .filter(n -> n%2 != 0)
                                     .collect(Collectors.toList());
        int sum = newlist.stream()
                      .reduce(0,(a,b) -> a+b);
                      System.out.println(sum);
                                     
    }

    public static void ques4(){

        List <String> list = Arrays.asList("Java","Stream","API");
        List <Integer> newlist = list.stream()
                                     .map(n->n.length())
                                     .collect(Collectors.toList());
        System.out.println(newlist); 
    }

    public static void ques5(){
        List <Integer> list = Arrays.asList(999,1000,1500,1000,2000);
        List <Integer> newlist = list.stream()
                                     .distinct()
                                     .filter(n -> n>1000)
                                     .collect(Collectors.toList());
        int sum = newlist.stream()
                         .reduce(0, (a,b) -> a+b);
        System.out.println(sum);

    }

    public static void ques6() {

        List <String> list = Arrays.asList("apple","banana","apricot","cherry","Avacodo");
        long count = list.stream()
                        .filter(n -> n.startsWith("A") || n.startsWith("a"))
                        .count();
        System.out.println(count);

    }

    public static void ques7(){
        
        List <String> list = Arrays.asList("john","ravi","abhishek","Raj");
        String res = list.stream()
                         .filter(n -> n.length()>4)
                         .collect(Collectors.joining(","));
                         System.out.println(res);
    }

    public static void ques8(){

        List <Integer> list = Arrays.asList(10,14,22,30);
        boolean res = list.stream()
                          .anyMatch(n -> n%7 == 0);

        System.out.println(res);
    }

    public static void ques9(){
        List <Integer> list = Arrays.asList(1,2,3,4);
        int mul = list.stream()
                      .reduce(1, (a,b) -> a*b);
        System.out.println(mul); 
    }

    public static void ques10(){
        List <String> list = Arrays.asList("Java is fun", "Streams are powerful");
        List <String> newlist = list.stream()
                                    .flatMap(mapper -> Arrays.stream(mapper.split(" ")))
                                    .collect(Collectors.toList());
        System.out.println(newlist);
    }
                                    

    public static void main(String[] args) {
        
        ques1();
        ques2();
        ques3();
        ques4();
        ques5();
        ques6();
        ques7();
        ques8();
        ques9();
        ques10();
    }
}