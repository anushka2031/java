public class palindrome {

    public static void main(String[] args) {
        int a=123;
        int res=0;
        int sum=0;

        while(a>0){
            int digit=a%10;
            res=res*10+digit;
            a=a/10;
            sum=sum+digit;
        }
        System.out.println(sum);

        if(a==res)
        System.out.println("no. is palindrome");
        else 
        System.out.println("no. is not palindrome");
    }
    
}
