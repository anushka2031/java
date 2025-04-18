import java.util.Scanner;

public class EvenOddCount {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=in.nextInt();
        int[] a= new int[n];
        int even=0;
        int odd=0;

        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++) {
            a[i]=in.nextInt();
            if( a[i] % 2 == 0)
             even++;
            else
             odd++;
        }

        System.out.println("Even : "+even);
        System.out.println("Odd : "+odd);
        
    }
    
}
