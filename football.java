import java.util.Scanner;

public class football {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String team1, team2="", name;
        int count1 = 0, count2 = 0;
        boolean secondTeamFound = false;

        
        team1 = sc.next();
        count1 = 1;

        
        for (int i = 1; i < n; i++) {
            name = sc.next();

            if (name.equals(team1)) {
                count1++;
            } 
            else {
                if (!secondTeamFound) {
                    team2 = name;          
                    secondTeamFound = true;
                }
                count2++;
            }
        }

    
        if (count1 > count2)
            System.out.println(team1);
        else
             System.out.println(team2);

        sc.close();

        
    }
}
