class Parent{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double a,double b){
        System.out.println(a+b);
    }
}

class Area{
    void area(double b,double h){
        System.out.println("area of triangle:"+(0.5*b*h));
    }
    void area(int l,int b){
        System.out.println("area of rectangle:"+(l*b));
    }
    void area(int a){
        System.out.println("area of square:"+(a*a));
    }
}

public class methodOverloding {
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.sum(2,3);
        obj.sum(2, 3,4);
        obj.sum(2.2, 4.4);

        Area a=new Area();
        a.area(2);
        a.area(2, 3);
        a.area(5.5, 2.2);
    }
    
}
