public class strongNo {
    
    static int fact(int n){
        if(n==1)
            return 1;
        
        return n*fact(n-1);
    }

    public static void main(String[] args) {

        int n = 145;
        int x = n;
        int sum =0;
        while (n>0) {
            int h = n%10;
            sum += fact(h);
            n/=10;
        }
        
        if(x == sum){
            System.out.println("Strong No.");
        }else{
            System.out.println("Not a Strong No.");
        }
        
    }
}
