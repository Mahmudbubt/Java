package javaapplication30;
public class Depp {
    String name;
    int id;
    static String UniversityName =  "II";
    
    Depp (String n,int i) {
     name=n;
     id=i;
    }
     
     void display (){
        System.out.println ("Name :"+name);
        System.out.println ("Id :"+id);
        System.out.println ("UniversityName :"+UniversityName);
    }
    
    
}
