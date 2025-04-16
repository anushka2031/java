import java.util.Scanner;

public class amax {
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
        
        int max=0;
        int sum=0;

        for(int k=0;k<arr.length;k++){
            
            sum=sum+arr[k];
            if(arr[k]>max)
            max=arr[k];
            
        }
        System.out.println("max:"+max);
        System.out.println("sum:"+sum);

    }
}
