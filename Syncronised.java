// Day: 29
// Date: 05/06/2025
// Day: Thursday

class MyThread extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(getName() + " is running with priority " + getPriority());
            Thread.yield();
        }
    }
}

class ProducerConsumer{
    private boolean isSignal = false;

    public synchronized void producer(){
        isSignal = true;
        System.out.println("Producer sending signal");
        notify();
    }

    public synchronized void isSignalGiven(){
        while(!isSignal){
            try{
                System.out.println("Consumer waiting for the signal");
                wait();
            }
            catch(Exception e){

            }
        }
        System.out.println("Consumer got the signal");
    }
}

class Bank{
    // static private boolean isFree = false;
    static int balance = 1000;
    int withdraw;
    Bank(int withdraw){
        this.withdraw = withdraw;
    }
    public synchronized void withdraw(){
        if(withdraw <= balance){
            System.out.println(Thread.currentThread().getName() + " Amount " + withdraw + " withdraw successfully");
            balance = balance - withdraw;
            System.out.println(Thread.currentThread().getName() + " Remaining Balance: " + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " Insufficient balance");
        }
        // isFree = true;
        notify();
    }
    public synchronized void isAvailable(){
        try{
            System.out.println("Waiting for other transaction");
            wait();
        }
        catch(Exception e){

        }
        // while(!isFree){
        // }
        System.out.println("Now second person can withdraw");
    }
}

class Syncronised {
    public static void main(String[] args) {
        // System.out.println("Main Thread");
        // Thread t1 = new Thread(()->{
        //     System.out.println("Thread t1");
        //     try {
        //         Thread.sleep(2000);
        //     } catch (InterruptedException e) {
        //     }
        //     System.out.println("It will print is last");
        // });
        // Thread t2 = new Thread(()->{
        //     System.out.println("Thread t2");
        // });
        // t1.start();
        // t2.start();

        // MyThread t1 = new MyThread();
        // MyThread t2 = new MyThread();

        // t1.setName("Low Priority Thread");
        // t2.setName("High Priority Thread");

        // t1.setPriority(Thread.MIN_PRIORITY); //1
        // t2.setPriority(Thread.MAX_PRIORITY); //10

        // t1.start();
        // t2.start();


        // ProducerConsumer p1 = new ProducerConsumer();

        // Thread t1 = new Thread(()->{
        //     p1.isSignalGiven();
        // });

        // Thread t2 = new Thread(()->{
        //     try {
        //         Thread.sleep(5000);
        //     } catch (Exception e) {
        //     }
        //     p1.producer();
        // });

        // t1.start();
        // t2.start();


        Bank b1 = new Bank(800);
        Bank b2 = new Bank(500);

        Thread t1 = new Thread(()->{
            b1.withdraw();
        });
        
        Thread t2 = new Thread(()->{
            try{
                b1.isAvailable();
                Thread.sleep(1000);
            }
            catch(Exception e){
                
            }
            b2.withdraw();
        });

        t2.start();
        t1.start();
    }
}