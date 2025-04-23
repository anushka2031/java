public class scount {

    public static void main(String[] args) {
        String str="racecarjhgahaha";
        char ch;
        int count=0;
        int consu;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
                count++;
                
            }
        }
        consu=str.length()-count;
        System.out.println("vowel count:"+count);
        System.out.println("consunant count:"+consu);
   }
    
}

