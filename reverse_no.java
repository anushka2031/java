import java.util.Scanner;

public class reverse_no {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a num:");
        int n= in.nextInt();
        int ld;
        int rev=0;
        while (n>0) {
            ld=n%10;
            n/=10;
            rev=(rev*10)+ld;
        }
        System.out.println("reversed no. :"+rev);
    }
    
}
