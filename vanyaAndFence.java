import java.util.Scanner;

public class vanyaAndFence {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int h = in.nextInt();
        
        int total = 0;
        for(int i=0;i<n;i++)
        {
            int pheight= in.nextInt();
            
            if(pheight > h){
                total= total+2;
            }else{
                total = total +1;
            }
        }

        System.out.println(total);
        
    }


}
