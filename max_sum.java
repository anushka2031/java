public class max_sum {

    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int sum=sum(202, 7);
        System.out.println("sum:"+sum);
        
        int max=0;
        while (sum>0) {
           int d=sum%10;
            
            if(d>max){
                max=d;
            }
            sum=sum/10;
            
        }
        System.out.println(max);
        
    }
    
}
