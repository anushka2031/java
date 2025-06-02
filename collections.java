import java.util.ArrayList;
import java.util.Collections;

class Student  implements Comparable <Student> {

    int age;
    String name;

    public Student( int age , String name){
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return age + " " + name;
    }

    @Override
    public int compareTo(Student s) {
        return this.age-s.age;
    }

}

public class collections {

    public static void main(String[] args) {
       
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(0);
        // list.add(4);
        // Collections.sort(list);
        // System.out.println(list);

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(13, "rahul"));
        list.add(new Student(11, "rohit"));
        list.add(new Student(15, "mohit"));
        Collections.sort(list);
        System.out.println(list);

    }
}