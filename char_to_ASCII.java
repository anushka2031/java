import java.util.Scanner;

public class char_to_ASCII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch= in.next().charAt(0);
        int c= (int)ch;
        System.out.println("ASCII value of the entered char is "+c);
    }
    
}
