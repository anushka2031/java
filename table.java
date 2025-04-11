import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n= in.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);           
        }
    }
    
}
