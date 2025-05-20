// Day: 15
// Date: 06/05/2025
// Day: Tuesday

class Student{
    int a;
    Student(int a){
        // a = a;
        this.a = a;
    }

    void print(){
        System.out.println(a);
    }
}

class Chaining{
    int a;
    Chaining(){
        System.out.println("I am here");
    }

    Chaining(int x){
        this();
        System.out.println(x);
    }

    Chaining(int x, int y){
        this(3);
        System.out.println(x+y);
    }
}

public class Thisptr {
    Thisptr(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Thisptr d = new Thisptr();
        System.out.println(d);

        Student s = new Student(10);
        s.print();

        Chaining ch = new Chaining(5,7);
    }
}
