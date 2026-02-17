import java.util.Scanner;

public class presents {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] pre = new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<=n;i++){
            pre[arr[i]] = i;
        }

        for(int i=1;i<=n;i++){
            System.out.print(pre[i] + " ");
        }
        sc.close();
    }
}
