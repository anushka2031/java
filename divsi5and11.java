public class divsi5and11 {

    public static void main(String[] args) {
        int num=33;
        if( num%5==0 && num%11==0)
         System.out.println("the number is divisible 5 and 11 both");
        else{
            if(num%5==0)
             System.out.println("the number is divisible by 5 only");
            else{
                if (num%11==0)
                 System.out.println("the number is divisible by 11 only");
                else
                 System.out.println("the number is not divisible by 5 and 11");
            }
        }
    }
    
}
