class animal{
    void eat(){
        System.out.println("eat");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("boww woww");
    }
}

class Puppy extends dog{
   void cute(){
    System.out.println("cutiesss");
   }
}

public class inheritance {

    public static void main(String[] args) {
        Puppy obj=new Puppy();
        obj.bark();
        obj.eat();
        obj.cute();
    }
    
}
