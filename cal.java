import java.util.Scanner;

public class cal {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int a= in.nextInt();
        System.out.println("Enter 2nd no:");
        int b= in.nextInt();
        System.out.println("Enter your char:");
        char c= in.next().charAt(0);

        switch(c) {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case'/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid Input");
            break;
        }
    }
}
