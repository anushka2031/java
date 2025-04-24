public class Smax_repeated {

    public static void main(String[] args) {
        String str="wwwwttttfghjjjjjjjjlllll";
        int maxcount=0;
        char[] ch=str.toCharArray();
        char max='0';

        for(int i=0;i<ch.length;i++){
            int count=0;
            char c= ch[i];
            for(int j=0;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount=count;
                max=c;
            }
        }
        System.out.println("The maximum repeated char is "+max);
        System.out.println("It is repeated for "+maxcount +" times" );
    }
    
}
