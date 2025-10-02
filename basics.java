import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        // System.out.println(num);

        if(num>=90){
            System.out.println("Grade A");
        }else if(num>=70){
            System.out.println("Grade B");
        }else if(num>=50){
            System.out.println("Grade C");
        }else if(num>=35){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }

    }
}
