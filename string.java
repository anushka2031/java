public class string {

    public static void main(String[] args) {
        // String str="hello";
        // System.out.println(str.charAt(1));
        // System.out.println(str.indexOf("z"));
        // for(int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.println(str.charAt(i));
        // }

        String str1="hello";
        String str2="hiiii";
        int count=0;

        for(int i=0;i<str1.length();i++){
             if(str1.charAt(i) == str2.charAt(i)){
                count++;
                System.out.println(str1.charAt(i));
                break;
             }
        }

       
        


    }
    
}
