public class questions {
     
    public static void natural(int n){
        System.out.println("natural nos:");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    public static void Even(int n){
        System.out.println("even nos:");
        for(int i=0;i<=n;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void rev_natural(int n){
        System.out.println("reverse natural nos:");
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }

    public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static int product(int n){
        int p=1;
        for(int i=1;i<=n;i++){
            p=p*i;
        }
        return p;
    }

    public static void digit(int n){
        int d;
        int sum=0;
        int count=0;
        int rev=0;
        System.out.println("digits are ");
        while (n>0) {
         d=n%10;
         n/=10;
         rev=(rev*10)+d;
         System.out.println(d);
         sum=sum+d;
         count++;
        }
        System.out.println("sum is "+sum);
        System.out.println("no of digits: "+count);
        System.out.println("reversed no is "+rev);

        if(n==rev)
        System.out.println("no is palindrome.");
        else 
        System.out.println("no is not a palindrome" );

    }

    

    public static void main(String[] args) {
       natural(10);
       Even(10);
       rev_natural(10);
       System.out.println("Sum : "+sum(10));
       System.out.println("product : "+product(10));
       digit(123);
       
    }
    
}
