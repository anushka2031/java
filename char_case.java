public class char_case {

    public static void main(String[] args) {
        char ch='D';
        if(ch>='A' && ch<='Z')
         System.out.println("Uppercase");
        else if(ch>='a' && ch<='z')
          System.out.println("Lowercase");
        else 
          System.out.println("Not a alphabet");
    }
    
}
