import java.util.Scanner;

public class switch_v_c {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character :");
        char c= in.next().charAt(0);
        
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                 System.out.println("Vowels");
                 break;
            default:
               System.out.println("Consonant");
               break;
        }
    }
}
