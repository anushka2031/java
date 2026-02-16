import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class twins {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        int total =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        // Arrays.sort(arr, Collections.reverseOrder());
        for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]<arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }

        int sum = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];
            count++;
            if(sum > total-sum){
                break;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
