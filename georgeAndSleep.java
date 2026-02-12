import java.util.Scanner;

public class georgeAndSleep {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String t = in.nextLine();
        
        int sh =(s.charAt(0) - '0')*10 + (s.charAt(1) - '0');
        int sm =(s.charAt(3) - '0')*10 +(s.charAt(4) - '0');

        int th =(t.charAt(0) - '0')*10 + (t.charAt(1) - '0');
        int tm =(t.charAt(3) - '0')*10 + (t.charAt(4) - '0');

        int fs = (sh*60) + sm;
        int ft = (th*60) +tm;

        int f = fs-ft;
        // cout<<f;

        if(f<0){
            f += 1440;
        }

        int resh = f/60;
        int resm = f%60;

        if(resh<10) System.out.print("0");;
        System.out.print(resh + ":");;
        if(resm<10) System.out.print("0");;
        System.out.print(resm);;




    }


}
