import java.util.Scanner;

public class linear_search {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=in.nextInt();
        int[] a= new int[n];

        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
           
        }

        int found=-1;
        System.out.println("Enter the element that you have to find:");
        int x=in.nextInt();
        
        for(int j=0;j<n;j++){
            if(a[j] == x){
            found=j;
            break;
            }
            
        }

        if(found != -1)
        System.out.println("The element x="+x+" is found at index i="+found);
        else
        System.out.println("The element is not found");
    }
    
}
