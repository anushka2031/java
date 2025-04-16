import java.util.Scanner;


public class array {

    public static void main(String[] args) {
        //int[] arr={1,2,3,4,5,6};

        Scanner in= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n= in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int k=0;k<arr.length;k++){
             System.out.println(arr[k]);
        }

        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }
    
}
