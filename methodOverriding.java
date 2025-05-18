class Parent{
    void eat(){
        System.out.println("maggie");
    }    
}
class child extends Parent{
    int a=5;
    void eat(){
        System.out.println("pasta");
    }
}
public class methodOverriding {

    public static void main(String[] args) {
        Parent obj=new child();
        obj.eat();
    }
    
}

