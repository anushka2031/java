// Day: 18
// Date: 09/05/2025
// Day: Friday

//import org.w3c.dom.css.Rect;

class ATM{
    private int amount;

    public void setMoney(int amount){
        this.amount = amount;
    }

    public int getMoney(){
        return amount;
    }
}

class Student{
    private String name;
    private int marks;

    public void setMarks(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }

    public void print(){
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Rectangle{
    private double length;
    private double width;

    public void setValue(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return (length + width) * 2;
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        ATM at = new ATM();
        at.setMoney(14000);
        System.out.println(at.getMoney());

        Student s1 = new Student();
        s1.setMarks("Anushka", 100);
        System.out.println(s1.getMarks());
        s1.print();

        Rectangle rc = new Rectangle();
        rc.setValue(5, 7);
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
    }
}

