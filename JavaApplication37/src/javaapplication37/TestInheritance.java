package javaapplication37;
class Person {
   String name;
   int age;
   void display () {
       System.out.println ("Name :"+name);
       System.out.println ("Age :"+age);
       System.out.println();
   }
}

class Teacher extends Person {
   String qualification;
  
void display () {
   System.out.println ("Name :"+name);
   System.out.println ("Age :"+age);
   System.out.println ("Qualification :"+qualification);
   System.out.println();
}
   
}

class Student extends Teacher {
   String address;
   
  
void display (){
   System.out.println ("Nmae :"+name);
   System.out.println ("Age :"+age);
   System.out.println ("Qualification :"+qualification);
   System.out.println ("Address :"+address);
   System.out.println ();
   
}
}


public class TestInheritance {
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