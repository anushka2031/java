class Student{
    // String firstName="anushka";
    // String lastName="tiwari";
    // void fullName(){
    //     System.out.println(firstName+ " " +lastName);
    // }
    String name="ravi";
    Student(String name){
        //name=firstName;
        System.out.println(name);
    }
}

class rectangle {
    
    int area(int l,int w){
        int area=l*w;
        return area;
    }
    
}

public class classses_objs {

    public static void main(String[] args) {
        Student obj = new Student("rahul");
        //obj.fullName();
        System.out.println(obj.name);
       
        

        rectangle r = new rectangle();
        System.out.println(r.area(20, 10));

    }
    
}
