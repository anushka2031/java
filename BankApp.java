import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
     
    String type;
    double amount;

    public Transaction( String type , double amount ){
        this.type = type;
        this.amount = amount;
    }

    public String toString(){
        return type + ": Rs. " + amount;
    }
}

class Account {

    private String Name;
    private int accountno;
    private double balance;

    public Account(String Name , int accountno , double balance){
        this.Name = Name;
        this.accountno = accountno;
        this.balance = balance;
    }

    ArrayList<Transaction> transactions = new ArrayList<>();

    public void Deposit( double amount ){

        if( amount > 0){
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Successfully Deposited");
        }
    }

    public void Withdraw ( double amount ){

        if( amount > 0 && amount <= balance ){
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public void ViewTransaction(){

        if( transactions.isEmpty() ){
            System.out.println("No Transactions yet...");
        }
        else{
            for( Transaction t : transactions){
                System.out.println(t);
            }
        }
    }

    public void CheckBalance(){

        System.out.println("Your current balance is Rs." + balance);

    }
}

public class BankApp {

    static Scanner sc = new Scanner(System.in);
    static Account account;

    public static void main(String[] args) {
        
        System.out.print("Enter account holders name :");
        String name = sc.nextLine();
        account = new Account(name, 110942, 0);
        System.out.println("Account is successfully created!");
        System.out.println("Account Number : " );

        int choice;
        do{
            System.out.println("\n 1. Deposit \n2. Withdarw \n3. Check Balance \n4. View Transactions \n5. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: 
                     System.out.println("Enter amount to deposit: ");
                     double dep = sc.nextDouble();
                     account.Deposit(dep);
                     break;
                
                case 2: 
                      System.out.println("Enter the amount to widraw: ");
                      double wid = sc.nextDouble();
                      account.Withdraw(wid);
                      break;
                case 3:
                      account.CheckBalance();
                      break;
                case 4:
                     account.ViewTransaction();
                     break;
                case 5:
                     System.out.println("Thank you for using our app.");
                     break;
                default:
                     System.out.println("Invalid Choice");

            }
        } while (choice != 5) ;

    }
}