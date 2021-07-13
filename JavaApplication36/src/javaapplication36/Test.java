package javaapplication36;
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person ();
        Teacher t1 = new Teacher ();
        Student s1 = new Student ();
        
    p1.name = "Mahmud";
    p1.age = 24;
    
    t1.name = "Haque";
    t1.age = 25;
    t1.qualification = "Student";
    
    s1.name = "Rakib";
    s1.age = 26;
    s1.qualification = "Employee";
    s1.address = "Dhaka";
    
    p1.display();
    t1.display();
    s1.display();
            
            
    }
    
}
