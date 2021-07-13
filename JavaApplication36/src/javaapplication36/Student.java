package javaapplication36;
public class Student extends Teacher {
    String address;
    
    @Override
void display (){
    System.out.println ("Nmae :"+name);
    System.out.println ("Age :"+age);
    System.out.println ("Qualification :"+qualification);
    System.out.println ("Address :"+address);
    System.out.println ();
    
}
}