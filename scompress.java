public class scompress {

    public static void main(String[] args) {
        String str="tiwari";
        String str1="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(str1.indexOf(c) == -1){
                str1+=c;
            }
        }
        System.out.println("compressed string:" + str1);
    }
}
