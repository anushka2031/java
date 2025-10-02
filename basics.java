import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

        // Scanner n = new Scanner(System.in);
        // int num = n.nextInt();
        // System.out.println(num);

        // if(num>=90){
        //     System.out.println("Grade A");
        // }else if(num>=70){
        //     System.out.println("Grade B");
        // }else if(num>=50){
        //     System.out.println("Grade C");
        // }else if(num>=35){
        //     System.out.println("Grade D");
        // }else{
        //     System.out.println("Fail");
        // }

        // switch (num) {
        //     case 1:
        //         System.out.println("monday");
        //         break;

        //     case 2:
        //         System.out.println("tuesday");
        //         break;
            
        //      case 3:
        //         System.out.println("wednesday");
        //         break;
        //      case 4:
        //         System.out.println("thursday");
        //         break;
           
        //      case 5:
        //         System.out.println("friday");
        //         break;
        //      case 6:
        //         System.out.println("saturday");
        //         break;
        //      case 7:
        //         System.out.println("sunday");
        //         break;
        
        
        //     default:
        //     System.out.println("Invalid");
        //         break;
        // }

        //int[] arr={1,2,3,4,5,6};

        Scanner in= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int i=0;
        while (i<n) {
            System.out.println(arr[i]);
            i++;
        }

    }
}
