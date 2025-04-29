public class questions {
     
    public static void natural(int n){
        for(int i=1;i<=n;i++){
            System.out.println("natural nums:"+i);
        }
    }

    public static void Even(int n){
        for(int i=0;i<=n;i++){
            if(i%2 == 0){
                System.out.println("Even nums:"+i);
            }
        }
    }

    public static void main(String[] args) {
       natural(10);
       Even(10);
    }
    
}
