public class srepeat {

    public static void main(String[] args) {
        
        // String str="hhlloo";
        // String newStr="";
        // for(int i=0;i<str.length();i++){
        //     char c=str.charAt(i);
        //     if(newStr.indexOf(c) == -1){
        //         newStr+=c;
        //         //System.out.println(c);
        //     }
            
        // }
        // System.out.println(newStr + " ");

        //for first repeated value

        String str="helolo";
        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    System.out.println(ch[j]);
                    return;
                }
            }
        }


    }
    
}
