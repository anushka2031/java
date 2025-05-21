public class scompress {

    static void compress(){
        String str="aaabbbbcc ";
        StringBuilder newStr = new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
        
            else{
                newStr.append(str.charAt(i-1)).append(count);
                count=1;
            }
       }
       System.out.println(newStr);
    }

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

        compress();
    }
}
