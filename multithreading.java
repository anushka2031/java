class MyThread extends Thread {
    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(5000);
        } catch (Exception e){}
        System.out.println("hi");
    }
}

public class multithreading {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("hii");
    }
}