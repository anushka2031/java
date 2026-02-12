import java.util.Scanner;

public class georgeAndSleep {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String t = in.nextLine();
        
        int sh =(s[0] - '0')*10 + (s[1] - '0');
        int sm =(s[3] - '0')*10 +(s[4] - '0');

        int th =(t[0] - '0')*10 + (t[1] - '0');
        int tm =(t[3] - '0')*10 + (t[4] - '0');

        int fs = (sh*60) + sm;
        int ft = (th*60) +tm;

        int f = fs-ft;
        // cout<<f;

        if(f<0){
            f += 1440;
        }

        int resh = f/60;
        int resm = f%60;

        if(resh<10) cout<<"0";
        cout<<resh<<":";
        if(resm<10) cout<<"0";
        cout<<resm;




    }


}
