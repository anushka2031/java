public class spalindrome {
    
    public static void main(String[] args) {
        String str="racecar";
        int i;
        String str1="";
        for(i=str.length()-1;i>=0;i--){
                str1=str1+str.charAt(i);
            }
        if(str.equals(str1))
        System.out.println("palindrom");
        else 
        System.out.println("not palindrom");

    }
}
