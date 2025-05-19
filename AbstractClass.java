// Day: 17
// Date: 08/05/2025
// Day: Thursday


abstract class Payment{
    abstract void pay(int x);
    void print(){
        System.out.println("Payment done");
    }
}

class UpiPayment extends Payment{
    void pay(int x){
        System.out.println("Payment done via upi " + x);
    }
}

class CardPayment extends Payment{
    void pay(int x){
        System.out.println("Payment done via card " + x);
    }
}

// 1. Create an abstract class 'Shape' with an abstract method 'area()'. Implement two subclasses 'Circle' and 'Rectangle'.

public class AbstractClass {
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.pay(10000);
        obj.print();
        Payment obj1 = new CardPayment();
        obj1.pay(14000);
        obj1.print();

        // Test t=new Test();
        // System.out.println(t.x);
        // t.print();
    }
}