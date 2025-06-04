class witdrawl extends Thread {
    static int totalBalance = 1000;
    int amount;
    public witdrawl (int amount){
        this.amount=amount;
    }
    public void run(){
        synchronized(witdrawl.class){
        if(totalBalance >= amount){
            System.out.println(Thread.currentThread().getName() +" is going to withdrawl" + " " + amount);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            totalBalance-=amount;
            System.out.println(Thread.currentThread().getName()+" remaining paisaaa" + " " + totalBalance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" aap gareeb hai !!!");
        }
        }
    }
}
 
public class bank_thread {
    public static void main(String[] args) {
        witdrawl t1 = new witdrawl(800);
        witdrawl t2 = new witdrawl(500);
        t1.start(); t2.start();
    }
}
