public class numToWord {
    
    public static void main(String[] args) {
        
        int n=123;
        String[] newN = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        while(n>0){
            int h =n%10;
            System.out.println(newN[h] + " ");
            n/=10;
        }
    }
}
