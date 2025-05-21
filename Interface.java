// interface Client{
//         void print();
//         void show();
// }

// class Dev implements Client{
//     public void print(){
//         System.out.println("bill");

//     }
//     public void show(){
//         System.out.println("briyani");
//     }

// }

//mutiple inheritance
interface Client1{
    void show();
}
interface Client2{
    void show();
    void print();
}

class Hello implements Client1,Client2{
    public void show(){
        System.out.println("for both");
    }

    public void print(){
        
    }
}

public class Interface {


    public static void main(String[] args) {
        // Dev obj = new Dev();
        // obj.show();
        // obj.print();

        Hello obj = new Hello();
        obj.show();
        obj.print();
    }
}