import java.util.Scanner;

public class multiple3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n= in.nextInt();
        if(n%3==0)
         System.out.println("Multiple of 3");
        else
         System.out.println("Not a multiple of 3");
    }
    
}
