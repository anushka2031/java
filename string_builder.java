public class string_builder {

    public static void main(String[] args) {

        StringBuilder str=new StringBuilder(10);

        str.append("hello hii byee");

        System.out.println(str.length());
        
        System.out.println(str.capacity());
        
    }
    
}
