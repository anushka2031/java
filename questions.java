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

    static void factor(int n){
        int sum=0;
        System.out.println("factors of the given no. are ");
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                sum=sum+i;
                System.out.print(i+" ");
            }
        }
        System.out.println("sum of factors of given no is "+sum);
    }
    
    public static void prime(int n){
        int count=0;
        for( int i=2;i<=n/2;i++){
            if(n%i==0){
                count=1;
                break;
            }
        }
        //System.out.println(prime?"prime":"not prime");
        if(count == 0)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }

    public static void armstrong(int n){
        int og,rem;
        int res=0;
        og=n;
        while (og!=0) {
            rem=og%10;
            res+=Math.pow(rem, 3);
            og/=10;
        }
        if(res == n)
        System.out.println("Amstrong");
        else
        System.out.println("Not Armstrong");
    }

    public static boolean perfect(int n){
        if (n==1) 
        return false;
        int sum=1;
        for (int i=2; i<n; i++) {
            if(n%i == 0){
                sum+=i;
            }
        }
        if (sum == n)
        return true;

        return false;
    }

    public static void main(String[] args) {
       natural(10);
       Even(10);
       rev_natural(10);
       System.out.println("Sum : "+sum(10));
       System.out.println("product : "+product(10));
       digit(123);
       factor(60);
       prime(100);
       armstrong(371);

       if(perfect(6))
       System.out.println("perfect no");
       else
       System.out.println("not perfect");
    }
    
}
