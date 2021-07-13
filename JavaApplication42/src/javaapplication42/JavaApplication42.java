package javaapplication42;

import java.util.LinkedList;
import static javaapplication42.Student.obj2;

class Student {

    static Student obj2;
    String name,classname;
    int id;
Student (String name,String classname,int id) {
    this.name = name;
    this.classname = classname;
    this.id = id;
}
void display (){
System.out.println ("Name :"+name);
System.out.println ("ClassName :"+classname);
System.out.println ("Id :"+id);

}

}

public class JavaApplication42 {
    public static void main(String[] args) {
    LinkedList <String> List = new LinkedList ();
    Student obj1 = new Student ("Mahmud","Ten",001);
    Student.obj2 = new Student ("X","Five",002);
    
    obj1.display();
    obj2.display ();
    
    }
    
}
