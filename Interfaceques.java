interface walkable{
    void walk();
}
interface runable{
    void run();
}

class Human implements walkable,runable {
    public void walk(){

        System.out.println("walking");
    }
    public void run(){
        System.out.println("running");
    }
}

interface A{
    void display();
}
interface B{
    void display();
}
class Demo implements A,B{
    public void display(){
        System.out.println("demo");
    }
}

interface Animal{
    void MakeSound();
}
class Dog implements Animal{
   public void MakeSound(){
    System.out.println("barking");
   }
}

interface Shape{
    void area();
}
class Circle implements Shape{
    public void area(){
        int r=5;
        System.out.println("area: "+(2*3.14*r));
    }
}

interface vehicle{
    void start();
}
class car implements vehicle{
    public void start(){
        System.out.println("vehicle is starting...");
    }
}


public class Interfaceques {
    public static void main(String[] args) {
        
    
    //  Human obj = new Human();
    //  obj.walk();
    //  obj.run();


    //  Demo obj = new Demo();
    //  obj.display();

    //  Dog obj = new Dog();
    //  obj.MakeSound();
     
    //  Circle obj = new Circle();
    //  obj.area();

     car obj = new car();
     obj.start();

    }

}
