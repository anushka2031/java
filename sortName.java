import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    int rollno;
    int age;
    String name;

    public Student(int rollno , int age , String name){
        this.rollno=rollno;
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return age + " " + name + " " + rollno;
    }

   
}

class SortbyName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }

}

class SortbyRollno implements Comparator<Student>{
    
    public int compare(Student s1, Student s2) {
        return s1.rollno-s2.rollno;

    }
}

public class sortName {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(8,13, "rahul"));
        list.add(new Student(2,11, "rohit"));
        list.add(new Student(13,15, "mohit"));
        Collections.sort(list,new SortbyName());
        for(Student s : list){
            System.out.println(s);
        }
        System.out.println(list);
        Collections.sort(list,new SortbyRollno());
         for(Student s : list){
            System.out.println(s);
        }
        System.out.println(list);
    }
    
}
